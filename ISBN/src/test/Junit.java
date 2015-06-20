package test;

public class Junit 
{
  public String isbn( String productId)
  {
    return productId.substring(3);
	  
  } 
  
  public int tot  = 0;
  public int verifyIsbn(String isbn)
  {
	  
	  int l = isbn.length();
	  int d = 10;
	  
	  for (int i=0;i<9;i++)
	  {
		  System.out.println(i);
	
			  
			  char a_char = isbn.charAt(i);
			  int x = Character.getNumericValue(a_char);
			  tot = tot + x * d-- ;  

	  }
	  System.out.println(tot);
	  return tot;	
  }
  

}