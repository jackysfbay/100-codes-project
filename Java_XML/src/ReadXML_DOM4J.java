import java.io.File;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class ReadXML_DOM4J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		try {
		Document document = reader.read(new File("books.xml"));
		Element bookStore = document.getRootElement();
		
		 Iterator it = bookStore.elementIterator();
		 
		 while (it.hasNext()) {
			 Element book = (Element) it.next();
			List<org.dom4j.Attribute> bootAttrs = book.attributes();
			
			for (org.dom4j.Attribute attr : bootAttrs) {
				System.out.println("node name: "+ attr.getName()+" - node value: "+attr.getValue());
			}		
			Iterator itt = book.elementIterator();
			while (itt.hasNext()) {
				Element bookChild = (Element)itt.next();
				System.out.println("sub node name: "+ bookChild.getName()+" - sub node value: "+bookChild.getStringValue());
			}
			System.out.println();
		}
		 
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
