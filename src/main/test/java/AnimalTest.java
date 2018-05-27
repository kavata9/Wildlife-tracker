import org.junit.*;
import static org.junit.Assert.*;

public class AnimalTest {

  @Test
  public void animal_instantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Lion");
    assertEquals(true, testAnimal instanceof Animal);
  }

  @Test
  public void getName_animalInstantiatesWithName_Lion() {
    Animal testAnimal = new Animal("Lion");
    assertEquals("Lion", testAnimal.getName());
  }

  @Test
  public void equals_returnsTrueIfNameAreSame_true() {
    Animal firstAnimal = new Animal("Lion");
    Animal anotherAnimal = new Animal("Lion");
    assertTrue(firstAnimal.equals(anotherAnimal));
  }
}