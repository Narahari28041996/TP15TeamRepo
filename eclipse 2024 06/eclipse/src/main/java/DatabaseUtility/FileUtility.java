package DatabaseUtility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String  getDataFromPropertiesFileCRM(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\eclipse.properties");
		Properties po=new Properties();
		po.load(fis);
	String keys=	po.getProperty(key);
		
	return keys;
	}
	public String getDataFromProperties(String url , String key) throws IOException {
		FileReader fir=new FileReader(url);
		Properties po=new Properties();
		po.load(fir);
	String data=	po.getProperty(key);
	
	return data;
	}
}
