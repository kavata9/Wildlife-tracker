public class EndageredAnimal {
  private String name;
  private int animalId;

  public EndageredAnimal(String name, int personId) {
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
  public boolean equals(Object otherEndageredAnimal){
    if (!(otherEndageredAnimal instanceof EndageredAnimal)) {
      return false;
    } else {
      EndageredAnimal newEndageredAnimal = (EndageredAnimal) otherEndageredAnimal;
      return this.getName().equals(newEndageredAnimal.getName()) &&
             this.getAnimalId() == newEndageredAnimal.getAnimalId();
    }
  }

}