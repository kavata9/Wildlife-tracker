import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class SightTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void Sight_instantiatesCorrectly_true() {
    Sighting testSighting = new Sighting("Here", 1);
    assertEquals(true, testSighting instanceof Sighting);
  }

  @Test
  public void Sighting_instantiatesWithName_String() {
    Sighting testSighting = new Sighting("Here", 1);
    assertEquals("Here", testSighting.getName());
  }

  @Test
  public void Sighting_instantiatesWithAnimalId_int() {
    Sighting testSighting = new Sighting("Here", 1);
    assertEquals(1, testSighting.getAnimalId());
  }

}