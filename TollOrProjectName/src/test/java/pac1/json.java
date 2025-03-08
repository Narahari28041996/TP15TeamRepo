package pac1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


public class json {

@Test
public void pasre() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
	Object obj=	parser.parse(new FileReader("C:\\Users\\Gurup\\Downloads\\chrome-win64\\chrome-win64\\MEIPreload\\manifest.json"));
		
	JSONObject map=(JSONObject)obj;
	
	String name=(String) map.get("username");
	String pwd=(String)map.get("password");
	
	
	
	}
}
