package read_xml;

/**********
 * Steps to Using XPath
Following are the steps used while parsing a document using XPath Parser.
1. Import XML-related packages.
2. Create a DocumentBuilder.
3. Create a Document from a file or stream.
4. Create an Xpath object and an XPath path expression.
5. Compile the XPath expression using XPath.compile() and get a list of nodes by evaluating the compiled expression via XPath.evaluate().
6. Iterate over the list of nodes.
7. Examine attributes.
8. Examine sub-elements.
 * **************/

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

//Import XML-related packages
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CopyOfread_xml {
   
   public static void main(String[] args) throws XPathExpressionException, SAXException, IOException, ParserConfigurationException {
      
    
    	  
    	//""));
         File inputFile = new File("C:\\GIT_AREA\\TestAutomation2.0\\conf\\AlmMappingByRelease.xml");
         
       //Create a DocumentBuilder.
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder;
         dBuilder = dbFactory.newDocumentBuilder();
       
       // 3. Create a Document from a file or stream.
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         XPath xPath =  XPathFactory.newInstance().newXPath();

         String expression = "//testcase-mapping[@AlmTestID=\"572759\"]/@fileName";	        
         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);

         for (int i = 0; i < nodeList.getLength(); i++) 
         {
            Node nNode = nodeList.item(i);
            System.out.println("\nCurrent Element :" + nNode.getTextContent());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("fileName no :" + eElement.getAttribute("fileName"));
           
            }
         }
         
      } 
  
}


