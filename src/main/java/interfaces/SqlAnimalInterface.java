package interfaces;

import models.Animal;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class SqlAnimalInterface implements AnimalInterface{
    private final Sql2o sql2o;

    public SqlAnimalInterface(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Animal animal) {
        String sql = "INSERT INTO animals(name, age) VALUES (:name, :age)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql,true)
                    .bind(animal)
                    .executeUpdate()
                    .getKey();
            animal.setId(id);
        }catch (Sql2oException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<Animal> getAll() {return null;}

    @Override
    public Animal findById(int id) {
        String sql = "SELECT * FROM animals WHERE id=:id";
        try (Connection conn = sql2o.open()){
            return conn.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetchFirst(Animal.class);
        }
    }
}
