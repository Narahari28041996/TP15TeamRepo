package pac1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {

@Test
public void getData() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.get("https://www.vogue.com/article/danish-neurolighting-trend-hygge?utm_source=firefox-newtab-en-intl");
		
		
		
		
		
	}
}
