
/**
 * 
 */
package read_html_tool;
import java.net.*;
import java.io.*;
import java.security.DigestInputStream;
/**
 * @author lucianiangelo
 *
 */
public class read_html {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		String myDirectoryPath = "C:\\Users\\lucianiangelo\\Desktop\\html_prova\\";
		  File dir = new File(myDirectoryPath);
		  File[] directoryListing = dir.listFiles();
		  if (directoryListing != null) {
		    for (File child : directoryListing) {
		    
				StringBuilder contentBuilder = new StringBuilder();
				try {
				    BufferedReader in = new BufferedReader(new FileReader(child.getAbsolutePath()));
				    String str;
				    while ((str = in.readLine()) != null) {
				        contentBuilder.append(str);
				    }
				    in.close();
				} catch (IOException e) {
				}
				String content = contentBuilder.toString();
				
				if (content.contains("direct"))
				{
					System.out.println("Obsoleto");
				}
				if (!content.contains("direct"))
				{
					System.out.println("Updated");
				}
		    	    	
		    }
		  }					
		// TODO Auto-generated method stub
	}
}
