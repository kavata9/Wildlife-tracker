import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class SightTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void sight_instantiatesCorrectly_true() {
    Sighting testSighting = new Sighting("Here", 1);
    assertEquals(true, testSighting instanceof Sighting);
  }

}