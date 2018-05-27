import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class EndageredAnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void EndageredAnimal_instantiatesCorrectly_true() {
    EndangeredAnimal testEndageredAnimal = new EndangeredAnimal()("Rhino", 1);
    assertEquals(true, testEndageredAnimal instanceof EndangeredAnimal);
  }

  @Test
  public void EndageredAnimal_instantiatesWithName_String() {
    EndageredAnimal testEndageredAnimal = new EndageredAnimal("Rhino",1);
    assertEquals("Rhino", testEndageredAnimal.getName());
  }
  @Test
  public void equals_returnsTrueIfNameAndAnimalIdAreSame_true() {
    EndageredAnimal testEndageredAnimal = new EndageredAnimal("Rhino", 1);
    EndageredAnimal anotherEndageredAnimal = new EndageredAnimal("Rhino", 1);
    assertTrue(testEndageredAnimal.equals(anotherEndageredAnimal));
  }
}