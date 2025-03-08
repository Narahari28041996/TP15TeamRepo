package pac1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.poifs.property.Property;
import org.testng.annotations.Test;

public class Propertiesdfk{

	@Test
public static void main(String [] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\Gurup\\OneDrive\\Desktop\\commondata.properties");
		Properties po=new Properties();
		po.load(fr);
		
		String url=po.getProperty("url");
		System.out.println(url);
	}
}
