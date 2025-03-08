package pac1;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class XmldikTest {

	@Test
	public void clearTest(XmlTest test) {
	System.out.println(test.getParameter("url"));
	System.out.println(test.getParameter("username"));
	System.out.println(test.getParameter("password"));
	System.out.println(test.getParameter("browser"));
	
	
		
	}
}
