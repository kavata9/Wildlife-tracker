import org.junit.*;
import static org.junit.Assert.*;

public class AnimalsTest {

  @Test
  public void animals_instantiatesCorrectly_true() {
    Animals testAnimals = new Animals("Lion");
    assertEquals(true, testAnimals instanceof Animals);
  }

}