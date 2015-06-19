
public class numbers {

	public static void main (String args [])
	{
		int binary =0b0100;
		int  hex = 0x4;
		System.out.println(areEqual(String.valueOf(binary),String.valueOf(hex))); 		
	}
	static Boolean areEqual(String binary, String hex) 
	{	
		int hexToInt = new Integer(hex).intValue();
		int binaryInt = new Integer(binary).intValue();
		System.out.println(hexToInt);
		System.out.println(binaryInt);
		if (hexToInt == binaryInt)
		return true;
		else 
		return false;	
	}		
}
