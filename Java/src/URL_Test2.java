import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.soap.SOAPBinding.Use;


public class URL_Test2 {

	public static void main(String[] args) throws IOException {
//		// CREATE URL object
//		URL  imooc = new URL("http://www.imooc.com");
//		URL url = new URL(imooc, "/space/index");
//		System.out.println(url.getProtocol());
//		System.out.println(url.getHost());
//		System.out.println(url.getPort());
//		System.out.println(url.getPath());
//		System.out.println(url.getFile());
//		System.out.println(url.getRef());
//		System.out.println(url.getQuery());
		
		URL url =new URL("http://www.163.com");
		InputStream is = url.openStream();
		// byte to character	stream
		InputStreamReader isr = new InputStreamReader(is,"gbk");
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
		isr.close();
		is.close();
		
	}

}
