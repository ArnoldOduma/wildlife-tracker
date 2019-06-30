import static spark.Spark.*;

import models.Sighting;
import org.sql2o.Connection;
import spark.ModelAndView;
import spark.template.handlebars.*;

import java.util.HashMap;
import java.util.Map;


public class App {

    public static void main(String[] args) {



        Connection conn;
        staticFileLocation("/public");

        get("/", (req,res)->{
            Map<String, Object> model = new HashMap<>();

            model.put("allSightings", Sighting.allSightings());
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/dashboard", (req,res)->{
            Map<String, Object> model = new HashMap<>();

            model.put("allSightings", Sighting.allSightings());
            return new ModelAndView(model,"dashboard.hbs");
        }, new HandlebarsTemplateEngine());
        post("/new-sighting", (req,res)->{
            Map<String, Object> model = new HashMap<>();

            int id = Integer.parseInt(req.queryParams("selectedAnimal"));
            String location = req.queryParams("location");
            String rangerName = req.queryParams("ranger");
            Sighting newSighting = new Sighting(id,location,rangerName);
            newSighting.saveSightedAnimal(newSighting);
            model.put("new",newSighting);

            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());
        post("/new-endangered", (req,res)->{
            Map<String, Object> model = new HashMap<>();

            int id = Integer.parseInt(req.queryParams("selectedAnimal"));
            String location = req.queryParams("location");
            String rangerName = req.queryParams("ranger");
            Sighting newSighting = new Sighting(id,location,rangerName);
            newSighting.saveSightedAnimal(newSighting);
            model.put("new",newSighting);

            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());

    }

}
