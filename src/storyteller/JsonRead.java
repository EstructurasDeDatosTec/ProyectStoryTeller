
package storyteller;

import java.io.File;
import storyteller.ApiCall;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;



public class JsonRead {
     public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        ApiCall jsonFile = new ApiCall();
        

        try {

            jsonFile.createJson();
            Object obj = parser.parse(new FileReader((File) jsonFile.getFile()));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            long age = (Long) jsonObject.get("age");
            System.out.println(age);

            // loop array
            JSONArray tags = (JSONArray) jsonObject.get("tags");
            Iterator<String> iterator = tags.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    
}
