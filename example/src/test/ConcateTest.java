package test;

import org.junit.Test;

import junit.framework.TestCase;

public class ConcateTest extends TestCase {
	
	@Test
	public void testConcatenate() 
	{
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
		
	}

}
