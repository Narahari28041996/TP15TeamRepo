package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
public void createContactTest(){
		
		String  URL=System.getProperty("url","http://localhost:8888");  //default if url not work
		String BROWSER=System.getProperty("browser","chrome");          //default if browser not work
		String USERNAME=System.getProperty("username","admin");         //default if username not work
		String PASSWORD=System.getProperty("password","password");      //default if password not work
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	System.out.println("execute createContactTest ");
}
	
	@Test
	public void modifyContactTest() {
	System.out.println("execute ");
}
	@Test
	public void deleteContactTest() {
		System.out.println("execute delete contact test ");
	}
}