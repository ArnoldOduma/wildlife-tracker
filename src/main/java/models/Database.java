package models;

import org.sql2o.Sql2o;

public class Database {
    public static Sql2o sql2otest = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "c3l12i9f6f6");
    public static Sql2o sql2o = new Sql2o("jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:databases/wildlife.sql'","","");
    public static Sql2o sql2otest2 = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "c3l12i9f6f6");
}
