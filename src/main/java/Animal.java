import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public abstract class Animal {
    public String name;
    public String health;
    public String age;
    public int id;
    public String species;

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Animal)) {
            return false;
        } else {
            Animal newAnimal = (Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName()) && this.getHealth().equals(newAnimal.getHealth())
                    && this.getAge().equals(newAnimal.getAge());
        }
    }
  }
