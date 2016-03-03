import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class UDPClient {

	public static void main(String[] args) {
		try {
			// define server's address, port and data
			InetAddress address = InetAddress.getByName("localhost");
			int port = 8800; 
			byte[] data = "User Name: admin; Password: 123".getBytes();
			//Ceate datagram, include data you need to send 
			DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
			// create DatagramSocket object
			DatagramSocket socket = new DatagramSocket();
			// DatagramSocket send()
			socket.send(packet);
			//Get data from server 
			// create datagram for geting data from server 
			byte[] data2 = new byte[1024];
			DatagramPacket  packet2 = new DatagramPacket(data2, data2.length);
			//get data from server 
			socket.receive(packet2);
			//read packet2
			String reply = new String(data2, 0, packet2.getLength());
			System.out.println("I am client, sever said: "+ reply);
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
