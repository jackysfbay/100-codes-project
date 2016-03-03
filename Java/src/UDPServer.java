import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class UDPServer {

	public static void main(String[] args) {
		
		try {
			//create sever datagramScoket, 
			DatagramSocket socket = new DatagramSocket(8800);
			byte[] data = new byte[1024];
			//Create Datagram, get the data from client
			DatagramPacket packet = new DatagramPacket(data, data.length);
			System.out.println("********Server is stating, waiting client connection*************");
			// receive data from client 
			socket.receive(packet); // this function will be block until receive data
			// read data from client
			String info = new String(data, 0, packet.getLength());
			System.out.println("I am Server, client said: "+info);
			
			//send the message to client when sever get info from client.  
			// define client address, port and data
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			byte[] message = "I got your message, client. From server".getBytes();
			//create datagram, 
			DatagramPacket datagramPacket = new DatagramPacket(message, message.length, address, port);
			// call client
			socket.send(datagramPacket);
			socket.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
