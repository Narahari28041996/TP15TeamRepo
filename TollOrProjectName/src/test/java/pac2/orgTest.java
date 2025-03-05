package pac2;


import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class orgTest  {
	
	@Test
public void createOrgTest() {
		System.out.println("execte createOrgTest")	;
	String  URL=System.getProperty("url","http://localhost:8888");  //default if url not work
	String BROWSER=System.getProperty("browser","chrome");          //default if browser not work
	String USERNAME=System.getProperty("username","admin");         //default if username not work
	String PASSWORD=System.getProperty("password","password");      //default if password not work
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
}
	
	@Test
	public void modifyOrgtTest() {
	System.out.println("execute modifyOrgTest");
}
}