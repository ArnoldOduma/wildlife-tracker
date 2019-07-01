package models;

import org.sql2o.Sql2o;

public class Database {
    public static Sql2o sql2otest = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "c3l12i9f6f6");
    public static Sql2o sql2o = new Sql2o("jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:databases/wildlife.sql'","","");
    public static Sql2o sql2otest2 = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "c3l12i9f6f6");
//    public static Sql2o sql2otest2 = new Sql2o("postgres://najudrltyjjkrq:3f9d2bac12e6d855fca923e8808eb8cdfcd6ac206679dee0f2b971649f815c78@ec2-54-243-47-196.compute-1.amazonaws.com:5432/dat07a64k60ph5","najudrltyjjkrq","3f9d2bac12e6d855fca923e8808eb8cdfcd6ac206679dee0f2b971649f815c78");
}
