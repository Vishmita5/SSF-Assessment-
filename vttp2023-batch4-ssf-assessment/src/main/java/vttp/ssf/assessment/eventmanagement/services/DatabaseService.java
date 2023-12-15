package vttp.ssf.assessment.eventmanagement.services;

import java.io.FileReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.ssf.assessment.eventmanagement.models.Event;



@Service
public class DatabaseService {
    
    // TODO: Task 1


    public static <Event> ArrayList<public static final String[] BEAN_REDIS = null;
    JsonArray Event> {

        ArrayList<Event> result = new ArrayList<Event>();
    

            JsonReader reader = Json.createReader(new StringReader("//events.json"));
            JsonObject result = reader.readObject();
            events= result.getJsonArray("events");

    

            return events.stream()
            .map(j -> j.asJsonObject())
            .map(o -> {
               String ID = o.getString("eventID");
               String name = o.getString("eventName");
               String date = o.getString("eventDate");
               String part = o.getString("participants");
               String size = o.getString("eventSize");

               return new Event (ID, name, date, part, size);
            })
            .toList();
            
    }


   
}




