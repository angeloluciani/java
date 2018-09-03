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

public class read_xml {
   
   public static void main(String[] args) {
      
      try {
    	  
    	//"C:\\GIT_AREA\\TestAutomation2.0\\conf\\AlmMappingByRelease.xml"));
         File inputFile = new File("C://Users//lucianiangelo//Desktop//input.xml");
         
       //Create a DocumentBuilder.
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder;
         dBuilder = dbFactory.newDocumentBuilder();
       
       // 3. Create a Document from a file or stream.
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();

         XPath xPath =  XPathFactory.newInstance().newXPath();

         String expression = "/class/student";	        
         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(
            doc, XPathConstants.NODESET);

         for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Student roll no :" + eElement.getAttribute("rollno"));
               System.out.println("First Name : " 
                  + eElement
                  .getElementsByTagName("firstname")
                  .item(0)
                  .getTextContent());
               System.out.println("Last Name : " 
                  + eElement
                  .getElementsByTagName("lastname")
                  .item(0)
                  .getTextContent());
               System.out.println("Nick Name : " 
                  + eElement
                  .getElementsByTagName("nickname")
                  .item(0)
                  .getTextContent());
               System.out.println("Marks : " 
                  + eElement
                  .getElementsByTagName("marks")
                  .item(0)
                  .getTextContent());
            }
         }
      } catch (ParserConfigurationException e) {
         e.printStackTrace();
      } catch (SAXException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (XPathExpressionException e) {
         e.printStackTrace();
      }
   }
}

