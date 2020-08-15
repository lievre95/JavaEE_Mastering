import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jayway.jsonpath.JsonPath;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Path;
import java.nio.file.Paths;

class JsonHandler {


    static Path testFilePath = Paths.get("res\\1.json");
    static Path testFilePath2;

    static String json = "{\n" +
            "  \"pageInfo\": {\n" +
            "    \"pageName\": \"Homepage\",\n" +
            "    \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "  },\n" +
            "  \"posts\": [\n" +
            "    {\n" +
            "      \"post_id\": \"0123456789\",\n" +
            "      \"actor_id\": \"1001\",\n" +
            "      \"author_name\": \"Jane Doe\",\n" +
            "      \"post_title\": \"How to parse JSON in Java\",\n" +
            "      \"comments\": [],\n" +
            "      \"time_of_post\": \"1234567890\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    public static void main(String[] args)  {
        //Creating Json
//        JSONObject obj = new JSONObject();
//
//        obj.put("name", "foo");
//        obj.put("num", Integer.valueOf(100));
//        obj.put("balance", new Double(1000.21));
//        obj.put("is_vip", Boolean.TRUE);
//
//        System.out.print(obj);
        // Parsing JSON Using org.json
        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);
        }
        //Parsing JSON Using Gson

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        String pageName2 = jsonObject.getAsJsonObject("pageInfo").get("pageName").getAsString();

        System.out.println(pageName2);
        JsonArray arr2 = jsonObject.getAsJsonArray("posts");
        for (int i = 0; i < arr2.size(); i++) {
            String post_id = arr2.get(i).getAsJsonObject().get("post_id").getAsString();
            System.out.println(post_id);

        }

        //Parsing JSON Using JsonPATH
        String pageName3 = JsonPath.read(testFilePath, "$.pageInfo.pageName");
        System.out.println(pageName3);
        Integer posts = JsonPath.read(testFilePath, "$.posts.length()");
        for (int i = 0; i < posts; i++) {
            String post_id = JsonPath.read(testFilePath, "$.posts[" + i + "].post_id");
            System.out.println(post_id);
        }
        // parsing file "JSONExample.json"


    }
}


