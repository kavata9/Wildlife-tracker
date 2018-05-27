import org.junit.*;
import static org.junit.Assert.*;

public class AnimalTest {

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

}