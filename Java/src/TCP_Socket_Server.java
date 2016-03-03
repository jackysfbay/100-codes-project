import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 
 * @author Jacky
 *  create multithread for handling more client requests 
 */

public class TCP_Socket_Server {
	public static void main(String[] args){
		try {
			// create server Socket with port and listen
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket socket = null;
			//record client sum
			int count =0;
			System.out.println("********Server is stating, waiting client connection*************");
			
			while (true) {
				//call accept() for listening and waiting client 
				 socket = serverSocket.accept();
				 //create serverThread
				 ServerThread serverThread = new ServerThread(socket);
				 //Start thread
				 serverThread.start();
				 count++;
				 System.out.println("total clients: "+count);
				 InetAddress address = socket.getInetAddress();
				 System.out.println("Client IP address: " + address.getHostAddress());
			}
			
//			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
