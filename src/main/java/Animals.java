public class Animals {
    private String name;
    private int id;
  
    public Animals(String name, int id) {
      this.name = name;
    }
  
    public String getName() {
      return name;
    }
  
    public int getId() {
      return id;
    }

    @Override
    public boolean equals(Object otherAnimal){
      if (!(otherAnimal instanceof Animals)) {
        return false;
      } else {
        Animals newAnimal = (Animals) otherAnimal;
        return this.getName().equals(newAnimal.getName()) &&
               this.getName().equals(newAnimal.getName());
      }
    }
  
  }