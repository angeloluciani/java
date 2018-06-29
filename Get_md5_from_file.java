package get_md5_from_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class Get_md5_from_file {	
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException 
	{	
		String file = "C:\\Users\\lucianiangelo\\Desktop\\ing_figure.png";
		MessageDigest md = MessageDigest.getInstance("MD5");
		String digest = getDigest(new FileInputStream(file), md, 2048);
		System.out.println("MD5 Digest:" + digest);
	}
	
	
	public static String getDigest(InputStream is, MessageDigest md, int byteArraySize)
			throws NoSuchAlgorithmException, IOException {

		md.reset();
		byte[] bytes = new byte[byteArraySize];
		int numBytes;
		while ((numBytes = is.read(bytes)) != -1) {
			md.update(bytes, 0, numBytes);
		}
		byte[] digest = md.digest();
		String result = new String(Hex.encodeHex(digest));
		return result;
	}
}
