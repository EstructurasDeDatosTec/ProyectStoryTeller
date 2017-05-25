
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
import java.util.ArrayList;
import java.util.Iterator;



public class JsonRead {         
     
     
     
    public static void main(String[] args) throws IOException {
        
        ApiCall jsonFile = new ApiCall();
        jsonFile.createJson();
        //jsonFile.Tags();
        
        
        
      
        

        /*try {

            jsonFile.createJson();
            Object obj = parser.parse(new FileReader("C:\\Users\\Joseph Salas\\Desktop\\UrlsJson.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            // loop array
            JSONArray tags = (JSONArray) jsonObject.get("Urls");
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
*/
    }
    
}
