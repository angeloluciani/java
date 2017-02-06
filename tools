package test;


import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class tools{

//C:\Users\angelo.luciani\Desktop\21092015FromBarbara\qa_last_test\ACER xml\EXAMPLE.0401.xml	
	
	
    public static void main(String[] args) {
    	
    	
    	System.out.println("*******************************************************************************************************************************");
    	System.out.println("1. print xml");
    	System.out.print("enter an integer to make your selection ====> ");
    	Scanner keyboard = new Scanner(System.in);
    	int c = keyboard.nextInt();   	
    		
    	switch(c) {
    	 
        case 1:
            
            String filePath = "C:\\Users\\angelo.luciani\\Desktop\\21092015FromBarbara\\qa_last_test\\ACER xml\\EXAMPLE.0401.xml";
            File xmlFile = new File(filePath);
            //First to parse it using a DOM parser, you can use the DocumentBuilderFactory to get the default DOM parser for your JVM:
            //http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                //Now you have an object representation of the XML file in a DOM Document object.
             
                
                
                
                //Finally you probably want to write the xml document to a string or to a file, this can be done with 
                // a Transformer object, which come from the transformer factory:
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");

                //initialize StreamResult with File object to save to file
                StreamResult result = new StreamResult(new StringWriter());
                DOMSource source = new DOMSource(doc);
                transformer.transform(source, result);

                String xmlString = result.getWriter().toString();
                System.out.println(xmlString);
                
                
            } 
            
            catch (SAXException | ParserConfigurationException | IOException | TransformerException e1) 
            {
                e1.printStackTrace();
            }
            break;
     
        case 2:
            
            break;
         
     
        case 3: 
            
        	 break;
        	
        default:
    }   	   	
 }   
}
