package test;

public class Junit {
	
	public String apg = "angelo"; 
	public boolean shownew;
	public String OLD_VALUE = "Hello OLD";
	public String NEW_VALUE = "Hello NEW";
	public int	VERSION_THRESHOLD = 3;
			
	public String getWelcomeMessage(int PlatformID, String PlatformType, int Appversion) 
	{
		if(PlatformType == "special" && Appversion == 1 && (PlatformID == 1 || PlatformID == 2))
		{
			return OLD_VALUE;
		}
		
		switch(PlatformID) {
		 
	    case 1:	    
	    return shownew(Appversion);
	 
	    case 2:
	    return shownew(Appversion);
	    
	    case 3: 
	    return OLD_VALUE;
	        	     
	    case 4:
	    return shownew(Appversion);
	    
	}
			
		return null;

	}
	
	public String shownew(int Appversion) {
    if (Appversion < VERSION_THRESHOLD)
    {
    	return OLD_VALUE;
    }
    else {
    	return NEW_VALUE;
    }
		
	}
	
}