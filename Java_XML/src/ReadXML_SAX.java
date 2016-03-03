import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class ReadXML_SAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("books.xml");
		//create SAXParserFactory instance
		SAXParserFactory factory =SAXParserFactory.newInstance();
		try {
			//get newSAXParser() from factory
			SAXParser parser =  factory.newSAXParser();
			//Create SAXParserHandler object 
			SAXParserHandler handler = new SAXParserHandler();
				parser.parse(file, handler);
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
