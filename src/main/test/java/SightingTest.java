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

  @Test
  public void equals_returnsTrueIfNameAndAnimalIdAreSame_true() {
    Sighting testSighting = new Sighting("Here", 1);
    Sighting anotherSighting = new Sighting("Here", 1);
    assertTrue(testSighting.equals(anotherSighting));
  }
  @Test
  public void save_returnsTrueIfDescriptionsAretheSame() {
    Sighting testSighting = new Sighting("Here", 1);
    testSighting.save();
    assertTrue(Sighting.all().get(0).equals(testSighting));
  }

  @Test
  public void save_assignsIdToSighting() {
    Sighting testSighting = new Sighting("Here", 1);
    testSighting.save();
    Sighting savedSighting = Sighting.all().get(0);
    assertEquals(savedSighting.getId(), testSighting.getId());
  }

  @Test
  public void all_returnsAllInstancesOfSighting_true() {
    Sighting firstSighting = new Sighting("Here", 1);
    firstSighting.save();
    Sighting secondSighting = new Sighting("There", 1);
    secondSighting.save();
    assertEquals(true, Sighting.all().get(0).equals(firstSighting));
    assertEquals(true, Sighting.all().get(1).equals(secondSighting));
  }

}