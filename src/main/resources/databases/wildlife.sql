SET MODE PostgreSQL;
CREATE TABLE IF NOT EXISTS animals(
    id int PRIMARY KEY auto_increment,
    name VARCHAR ,
    age int
);

CREATE TABLE IF NOT EXISTS sightings(
    id int PRIMARY KEY auto_increment,
    animal_id int,
    animal_location VARCHAR ,
    ranger_name VARCHAR
);