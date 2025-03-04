package pac2;

import java.lang.reflect.Method;

import org.testng.annotations.Test;


public class orgTest  {
	
	@Test
public void createOrgTest(Method mth) {
	System.out.println("execute " +mth.getName());
}
	
	@Test
	public void modifyOrgtTest(Method mth) {
	System.out.println("execute "+mth.getName());
}
}