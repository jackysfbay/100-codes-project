import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML_DOM {

	public static void main(String[] args) {
		try {
			File file = new File("Languages.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			Element root = document.getDocumentElement();// Get Root elements
			System.out.println("cat=" + root.getAttribute("cat"));
			NodeList list = root.getElementsByTagName("lan");
			for (int i = 0; i < list.getLength(); i++) {
				Element lan = (Element) list.item(i);
				System.out.println("-----------------------");
				System.out.println("ID = " + lan.getAttribute("id"));

				// Element name = (Element)
				// lan.getElementsByTagName("name").item(0);
				// System.out.println("name ="+ name.getTextContent());

				NodeList cList = lan.getChildNodes();
				for (int j = 0; j < cList.getLength(); j++) {
					Node c = cList.item(j);
					if (c instanceof Element) {
						System.out.println(c.getNodeName() + "="
								+ c.getTextContent());
					}
				}
			}

		} catch (ParserConfigurationException e) {
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
