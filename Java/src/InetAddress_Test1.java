import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class InetAddress_Test1 {

	public static void main(String[] args) {
		try {
			// Get host InetAddress object
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Host name: "+localHost.getHostName());
			System.out.println("IP address: "+localHost.getHostAddress());
			byte[] bytes = localHost.getAddress();
			System.out.println(Arrays.toString(bytes));
			
			// get InetAddress instance by host name
			
			InetAddress localHost2 = InetAddress.getByName("ShangJuns-MacBook-Pro.local");
			

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
