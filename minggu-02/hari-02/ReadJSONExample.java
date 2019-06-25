import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExample
{
    // @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        
        try(FileReader reader = new FileReader("C:/Users/Donut/Documents/praxis/minggu-02/hari-02/mhs.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONObject mhs = (JSONObject) obj;
            System.out.println(mhs);
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}