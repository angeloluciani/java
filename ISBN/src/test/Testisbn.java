/**
 * 
 */
package test;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author fafa
 *
 */
public class Testisbn extends TestCase {
	@Test
	public void testisbn1() 
	{
		Junit test = new Junit();
		String result = test.isbn("978140007917");
		System.out.println(result);
		assertEquals("140007917",result);	
	}
	
	@Test
	public void testisbn2() 
	{
		Junit test = new Junit();
		int result = test.verifyIsbn("140007917");
		System.out.println("xds"+result);
		assertEquals(134,result);
		assertEquals(0,(result+9)%11);
	}
	

}
