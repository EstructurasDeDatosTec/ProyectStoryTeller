package storyteller;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class ApiCall {
    
    private HttpEntity entity;

    public HttpEntity getFile() {
        return entity;
    }

    public void setFile(HttpEntity pEntity) {
        entity = pEntity;
    }
    
    
    
    
    public void createJson()
    {
        HttpClient httpclient = new DefaultHttpClient();

        try
        {
            URIBuilder builder = new URIBuilder("https://eastus2.api.cognitive.microsoft.com/vision/v1.0/analyze");

            builder.setParameter("visualFeatures", "Tags");
            builder.setParameter("details", "Landmarks");
            builder.setParameter("language", "en");

            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers - replace this example key with your valid subscription key.
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", "cf86f75d31684af4b05e8a15fcf239ab");

            // Request body. Replace the example URL with the URL for the JPEG image of a celebrity.
            StringEntity reqEntity = new StringEntity("{\"url\":\"http://wac.450f.edgecastcdn.net/80450F/981thehawk.com/files/2014/09/istock-630x420.jpg\"}");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            entity = response.getEntity();

            if (entity != null)
            {
               
               System.out.println(EntityUtils.toString(entity));
                
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    

    
}
