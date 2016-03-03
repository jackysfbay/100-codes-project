import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author Jacky
 *
 *	Server thread
 */
public class ServerThread extends Thread {

	//define socket 
	Socket socket = null;
	
	public ServerThread (Socket socket) {
		this.socket = socket;
	}
	//execute thread, respond client request.
	 public void run() {
		 	InputStream is = null;
			InputStreamReader isr= null;
			BufferedReader br= null;
			//Get outputStream, respond client request
			OutputStream os= null;
			PrintWriter pw= null;
			try {
				is = socket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				String info = null;
				while ((info = br.readLine()) !=null){ //read client information
					System.out.println("I am server, client said: " + info);
				}
				socket.shutdownInput();
				os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.write("Welcome");
				pw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				//Close
				try {
					if(pw!=null)
						pw.close();
					if(os!=null)
						os.close();
					if(br!=null)	
						br.close();
					if(isr!=null)
						isr.close();
					if(is!=null)
						is.close();
					if(socket!=null)
						socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}
}


