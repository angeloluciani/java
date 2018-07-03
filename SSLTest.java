import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * @author lucianiangelo
 *
 */
public class SSLTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		
		 // configure the SSLContext with a TrustManager
		URL obj = new URL("https://wwwuat5.ingdirect.idi.it/");
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("insert a proxy here", 9090));
		
        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
        SSLContext.setDefault(ctx);

        //URL url = new URL("https://wwwuat5.ingdirect.idi.it/");
        HttpsURLConnection conn = (HttpsURLConnection) obj.openConnection(proxy);
        conn.setHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                return true;
            }
        });
        System.out.println(conn.getResponseCode());
        conn.disconnect();
		
	}
	
	 private static class DefaultTrustManager implements X509TrustManager {

	        @Override
	        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

	        @Override
	        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

	        @Override
	        public X509Certificate[] getAcceptedIssuers() {
	            return null;
	        }
	    }
}
