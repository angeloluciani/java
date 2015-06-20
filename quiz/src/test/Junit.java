package test;

public class Junit {
	
	
	String OLD_VALUE = "Hello OLD";
	String NEW_VALUE = "Hello NEW";
	int	VERSION_THRESHOLD = 3;
			
	public String getWelcomeMessage(int PlatformID, String PlatformType, int Appversion) 
	{
		if(PlatformType == "special" && Appversion == 1 && (PlatformID == 1 || PlatformID == 2))
		{
			return OLD_VALUE;
		}
		
		
		return PlatformType;

	}
}