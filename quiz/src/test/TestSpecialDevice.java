package test;

import org.junit.Test;

import junit.framework.TestCase;

public class TestSpecialDevice extends TestCase {
	
	//test getWelcomeMessage(int PlatformID, String PlatformType, int Appversion)
	
	String OLD_VALUE = "Hello OLD";
	String NEW_VALUE = "Hello NEW";
	
	@Test
	public void testSpecialDevice() {
		Junit test = new Junit();
		String result = test.getWelcomeMessage(1,"special",1);
		assertEquals(OLD_VALUE , result);
	}

	@Test
	public void testSpecialDevice2() {
		Junit test = new Junit();
		String result = test.getWelcomeMessage(2,"special",1);
		assertEquals(OLD_VALUE , result);
	}
	
	@Test
	public void testSpecialDevice3() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(2,"special",4);
		assertFalse(OLD_VALUE == result);	
	}
}
