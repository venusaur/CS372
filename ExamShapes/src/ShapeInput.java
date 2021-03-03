import java.util.*;
import org.json.*;

public class ShapeInput {
   public static void main(String args[]) {
	  String jsonDataString = "{\"type\":\"circle\",\"id\":0,\"radius\":6,\"color\":\"yellow\"}";
      JSONObject jsonObject = new JSONObject(jsonDataString);
      List<String> list = new ArrayList<String>();
      JSONArray jsonArray = jsonObject.getJSONArray("userInfo");
      for(int i = 0 ; i < jsonArray.length(); i++) {
         list.add(jsonArray.getJSONObject(i).getString("type"));
         System.out.println(jsonArray.getJSONObject(i).getString("type")); // display type
      }
   }
}