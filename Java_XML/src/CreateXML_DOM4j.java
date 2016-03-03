import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class CreateXML_DOM4j {

	public static void createXML() {
		Document document = DocumentHelper.createDocument();
		Element rss = document.addElement("rss");
		rss.addAttribute("version", "2.0");
		Element channel = rss.addElement("channel");
		Element title = channel.addElement("title");
		title.setText("National News");
		File file = new File("rssNews.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		try {
			XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
			writer.setEscapeText(false);// setEscapeText : T/F ....
			writer.write(document);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createXML();
	}

}
