import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
    public void animal_instantiatesCorrectly_true() {
        Animal testAnimal = new Animal("Lion", "healthy", "young");
        assertEquals(true, testAnimal instanceof Animal);
    }

    @Test
    public void getName_animalInstantiatesWithName_Tiger() {
        Animal testAnimal = new Animal("Lion", "healthy", "young");
        assertEquals("Tiger", testAnimal.getName());
    }

    @Test
    public void getHealth_animalInstantiatesWithHealth_healthy() {
        Animal testAnimal = new Animal("Lion", "healthy", "young");
        assertEquals("healthy", testAnimal.getHealth());
    }

    @Test 
    public void getAge_animalInstantiatesWithAge_young() {
        Animal testAnimal = new Animal("Lion", "healthy", "young");
        assertEquals("young", testAnimal.getAge());
    }

    @Test
    public void equals_returnsTrueIfNameHealthAndAgeAreSame_true() {
        Animal firstAnimal = new Animal("Lion", "healthy", "young");
        Animal anotherAnimal = new Animal("Lion", "healthy", "young");
        assertTrue(firstAnimal.equals(anotherAnimal));
    }

    @Test
    public void save_insertsObjectIntoDatabase_Animal() {
    Animal testAnimal = new Animal("Tiger", "healthy", "young");
    testAnimal.save();
      assertTrue(Animal.all().get(0).equals(testAnimal));
    }

    @Test
    public void all_returnsAllInstancesOfAnimal_true() {
      Animal firstAnimal = new Animal("Lion", "healthy", "young");
      firstAnimal.save();
      Animal secondAnimal = new Animal("Pantha", "ill", "newborn");
      secondAnimal.save();
      assertEquals(true, Animal.all().get(0).equals(firstAnimal));
      assertEquals(true, Animal.all().get(1).equals(secondAnimal));
    }

    @Test
    public void save_assignsIdToObject() {
    Animal testAnimal = new Animal("Lion", "healthy", "young");
    testAnimal.save();
      Animal savedAnimal = Animal.all().get(0);
      assertEquals(testAnimal.getId(), savedAnimal.getId());
    }

    @Test
    public void find_returnsAnimalWithSameId_secondAnimal() {
        Animal firstAnimal = new Animal("Lion", "healthy", "young");
        firstAnimal.save();
        Animal secondAnimal = new Animal("Pantha", "ill", "newborn");
        secondAnimal.save();
      assertEquals(Animal.find(secondAnimal.getId()), secondAnimal);
    }

    @Test
  public void getSightings_retrievesAllSightingsFromDatabase_sightingList() {
    Animal testAnimal = new Animal("Lion", "healthy", "young");
    testAnimal.save();
    Sighting firstSighting = new Sighting("Here", testAnimal.getId());
    firstSighting.save();
    Sighting secondSighting = new Sighting("There", testAnimal.getId());
    secondSighting.save();
    Sighting[] sightings = new Sighting[] { firstSighting, secondSighting };
    assertTrue(testAnimal.getSightings().containsAll(Arrays.asList(sightings)));
  }

}