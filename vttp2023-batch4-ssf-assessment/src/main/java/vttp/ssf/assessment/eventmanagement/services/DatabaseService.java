package vttp.ssf.assessment.eventmanagement.services;


import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.ssf.assessment.eventmanagement.models.Event;



@Service
public class DatabaseService {
    
    // TODO: Task 1


    public static <Event> ArrayList<JsonArray Event> {

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




