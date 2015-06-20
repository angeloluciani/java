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
	
	@Test
	public void testSpecialDevice4() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(1,"x",1);
		System.out.println(result);
		assertTrue(OLD_VALUE == result);	
	}
	
	@Test
	public void testSpecialDevice5() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(2,"x",2);
		assertTrue(OLD_VALUE == result);	
	}
	
	@Test
	public void testSpecialDevice6() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(3,"x",2);
		assertTrue(OLD_VALUE == result);	
	}
	
	@Test
	public void testSpecialDevice7() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(4,"x",2);
		assertTrue(OLD_VALUE == result);	
	}
	
	@Test
	public void testSpecialDevice8() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(4,"x",3);
		assertTrue(NEW_VALUE == result);	
	}
	
	@Test
	public void testSpecialDevice9() 
	{
		Junit test = new Junit();
		String result = test.getWelcomeMessage(4,"x",2);
		assertTrue(OLD_VALUE == result);	
	}
	
}
