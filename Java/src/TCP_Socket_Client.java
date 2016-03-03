import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * base on TCP socket connection, 
 * user login
 * client side
 * @author Jacky
 */

public class TCP_Socket_Client {
	public static void main(String[] args){
		try {
			//Get inputStream, reand the infor from client

			//send request to server 
			Socket socket = new Socket("localhost",8888);
			//get outputStream , send login information 
			OutputStream os = socket.getOutputStream(); //OutputStream
			PrintWriter pw = new PrintWriter(os); // change OutputStream to printWriter
			pw.write("User Name: tsom; Password: 1222s23");
			pw.flush();
			//Close
			socket.shutdownOutput();
			// get outputstream from server info
			InputStream  is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String info=null;
			while ((info = br.readLine()) !=null) {
				System.out.println("I am client, Server said: "+ info);
			}
			
			br.close();
			isr.close();
			is.close();
			os.close();
			socket.close();
			pw.close();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
