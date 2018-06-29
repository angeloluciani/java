
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
 

public class ResponseHeaderUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			 
			//URL obj = new URL("https://wwwuat3.ingdirect.idi.it");
			URL obj = new URL("https://www.ingdirect.it/");
			//URL obj = new URL("https://www.corriere.it/");
			//System.setProperty("java.net.useSystemProxies", "true");
			
			
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("insert the proxy here", "insert the port here"));
			//URL url = new URL("https://wwwuat5.ingdirect.idi.it/");
			//HttpURLConnection uc = (HttpURLConnection)url.openConnection(proxy);
			
			URLConnection conn = obj.openConnection(proxy);
			Map<String, List<String>> map = conn.getHeaderFields();
			

 
			System.out.println("Printing All Response Header for URL: " + obj.toString() + "\n");
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
			System.out.println("\nGet Response Header By Key ...\n");
			List<String> contentLength = map.get("Content-Length");
			if (contentLength == null) {
				System.out.println("'Content-Length' doesn't present in Header!");
			} else {
				for (String header : contentLength) {
					System.out.println("Content-Lenght: " + header);
				}
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
