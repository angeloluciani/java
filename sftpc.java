
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;


public class sftp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		 File file = new File ("C:\\last\\xdm.war");
		 
		 if (file.exists()){
		     file.delete();
		 }  
		
		JSch jsch = new JSch();
	        Session session = null;
	        try {
	            session = jsch.getSession("user", "insert ip", port);
	            session.setConfig("StrictHostKeyChecking", "no");
	            session.setPassword("password");
	            session.connect();

	            Channel channel = session.openChannel("sftp");
	            channel.connect();
	            ChannelSftp sftpChannel = (ChannelSftp) channel;
	            sftpChannel.get("/srv/xdm/webapps/xdm/xdm.war", "C:\\last\\xdm.war");
	            sftpChannel.exit();
	            session.disconnect();
	        } catch (JSchException e) {
	            e.printStackTrace();  
	        } catch (SftpException e) {
	            e.printStackTrace();
	        }
	    }

	}
