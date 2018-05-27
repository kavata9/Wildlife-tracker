iimport org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class EndangeredAnimalTest{
  EndangeredAnimal testEndangeredAnimal;
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Before
  public void setUp(){
    testEndangeredAnimal = new EndangeredAnimal("fluffy", "panda", "healthy", "young");
  }

  @Test
  public void animals_instantiatesCorrectly_true() {
    assertTrue(testEndangeredAnimal instanceof EndangeredAnimal);
  }

}