package domainname.appname.modulename.BaseClass;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import DatabaseUtility.DatabaseUtility;
import DatabaseUtility.FileUtility;

public class BaseClass {
	public DatabaseUtility dlib=new DatabaseUtility();
	public FileUtility flib=new FileUtility();
public 	WebDriver driver;

	@BeforeSuite
	public void configBs() throws Throwable {
		System.out.println("connect to database");
		
		dlib.connectToDatabaseNinza_hrm();
	}
	@BeforeClass
	public void cofigBc() throws IOException {
		System.out.println("launch a browser");
		
	String browser=	flib.getDataFromPropertiesFileCRM("browser");
	String url=flib.getDataFromPropertiesFileCRM("url");
		
	
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	driver.get(url);
	}
	
	@BeforeMethod
	public void configBm() {
		
	}
	
}

