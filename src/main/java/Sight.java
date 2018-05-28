import org.sql2o.*;
public class Sight {
    private String name;
    private int animalId;
    private int id;
  
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

    public int getId(){
        return id;
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

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO sightings (name, animalid) VALUES (:name, :animalId)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("name", this.name)
        .addParameter("animalId", this.animalId)
        .executeUpdate()
        .getKey();
    }
  }
  }