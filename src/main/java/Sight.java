import javax.xml.stream.Location;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;


public class Sight {
    private String location;
    private int animalId;
    private int id;
  
    public Sight(String name, int animalId) {
      this.location = location;
      this.animalId = animalId;
    }
  
    public String getLocation(){
      return location;
    }
  
    public int getAnimalId(){
      return animalId;
    }

    public int getId(){
        return id;
      }

      public static Sight find(int id) {
        try(Connection con = DB.sql2o.open()) {
          String sql = "SELECT * FROM sightings where id=:id";
          Sight sighting = con.createQuery(sql)
            .addParameter("id", id)
            .executeAndFetchFirst(Sight.class);
          return sighting;
        }
      }

      @Override
      public boolean equals(Object otherSighting){
        if (!(otherSighting instanceof Sight)) {
          return false;
        } else {
          Sight newSighting = (Sight) otherSighting;
          return this.getLocation().equals(newSighting.getLocation()) &&
                 this.getAnimalId() == newSighting.getAnimalId();
        }
      }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO sightings (location, animalid) VALUES (:name, :animalId)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("location", this.location)
        .addParameter("animalId", this.animalId)
        .executeUpdate()
        .getKey();
    }
  }

  public static List<Sight> all() {
    String sql = "SELECT * FROM sightings";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Sight.class);
    }
  }

  }