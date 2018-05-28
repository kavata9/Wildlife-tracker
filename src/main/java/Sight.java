public class Sight {
    private String name;
    private int animalId;
  
    public Sight(String name, int animalId) {
      this.name = name;
      this.animalId = animalId;
    }
  
    public String getName(){
      return name;
    }
  
    public int getAnimalId(){
      return animalId;
    }

    @Override
  public boolean equals(Object otherSighting){
    if (!(otherSighting instanceof Sight)) {
      return false;
    } else {
      Sight newSighting = (Sight) otherSighting;
      return this.getName().equals(newSighting.getName()) &&
             this.getAnimalId() == newSighting.getAnimalId();
    }
  }
  
  }