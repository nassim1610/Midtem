package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * This XmlReader class are using DOM parser to read data from XML.
 */

public class XmlReader {
	
	public List<Student> parseData(String tagName,String path) throws ParserConfigurationException, SAXException, IOException{

	List<Student> list = new ArrayList<>();

	return list;		
  }
	
	//This convert method need to be implemented.
	public String convertIntToChar(String score){
		String grade = "";
		
		
		return grade;	
	}
	
}