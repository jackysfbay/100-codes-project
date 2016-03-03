import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XML_DOM {

	public static void main(String[] args) {
		
		File file = new File("books.xml");
		try {
			//Create  DocumentBuilderFactory.newInstance(); 
			DocumentBuilderFactory builderFactory =DocumentBuilderFactory.newInstance();
			//Create DocumentBuilder object
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			//Use parse() to get a XML file 
			Document doc =  builder.parse(file);
			//Get Book List by using getElementsByTagName("book")
			NodeList bookList = doc.getElementsByTagName("book");
			//Total 2 books
			System.out.println("Total "+bookList.getLength()+ " books: ");
			System.out.println("-------------------------------");
			
			//for loop the bookList 
			for (int i = 0; i < bookList.getLength(); i++) {
						Node book = bookList.item(i);
						NamedNodeMap attrs = book.getAttributes();
						System.out.println("The "+ (i+1)+ " book has "+ attrs.getLength()+" attributes");
					
						/**
						 * If you don't know the attributes and value, you can use for loop,
						 */
//						for (int j = 0; j < attrs.getLength(); j++) {
//							//  item(j) to get book node's attributes
//							Node attr = attrs.item(j);
//							//	Get attribute name
//							System.out.print("Attribute name: "+attr.getNodeName()+" - ");
//							// Get attribute value
//							System.out.println("Attribute value: "+ attr.getNodeValue());
//							System.out.println();
//							
//						}
						
//				/**
//				 * if you know the attributes and values, you can use element to get book's attributes by name.
//				 */
//						Element book = 	(Element) bookList.item(i);
//						String attrValue = book.getAttribute("id");
//						System.out.println("Book "+i+" - ID arrtibute's value: "+ attrValue);
						NodeList childNodes = book.getChildNodes();
						System.out.println("Book child nodes has: " + childNodes.getLength());
						for (int j = 0; j < childNodes.getLength(); j++) {
							//filter #text and element
							if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
								//Get node name from the element  
								System.out.print(childNodes.item(j).getNodeName()+ " - ");
								/**getFirstChild().getNodeValue() 
								 * getTextContent()
								 * are different 
								 */
//								System.out.println(childNodes.item(j).getFirstChild().getNodeValue());
								System.out.println(childNodes.item(j).getTextContent());
							}
//							if (childNodes.item(j) instanceof Element ) {
//								System.out.println(childNodes.item(j).getNodeName());	
//							}
							
						}
						
			}
			
			
			
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
