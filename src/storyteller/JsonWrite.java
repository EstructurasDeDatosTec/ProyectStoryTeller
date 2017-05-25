
package storyteller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class JsonWrite {
    
        public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        JSONArray list = new JSONArray();
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba1.jpg#");
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba2.jpg#");
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba3.jpg#");
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba4.jpg#");
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba5.jpg#");
        list.add("https://www.dropbox.com/home/Story%20Teller?preview=Prueba6.jpg#");

        obj.put("Urls", list);

        try (FileWriter file = new FileWriter("C:\\Users\\Joseph Salas\\Desktop\\UrlsJson.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

    
}
