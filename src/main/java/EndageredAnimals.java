import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class EndangeredAnimal extends Animal {
  private String health;
  private String age;

  public static final String HEALTH_ILL = "ill";
  public static final String HEALTH_HEALTHY = "healthy";
  public static final String HEALTH_OK = "ok";

  public static final String AGE_BABBY = "newborn";
  public static final String AGE_YOUNG = "young";
  public static final String AGE_ADULT = "adult";

  public EndangeredAnimal(String name, String species, String health, String age){
    this.name = name;
    endangered = true;
    this.health = health;
    this.age = age;
    this.species = species;
  }
