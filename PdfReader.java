/**
 * 
 */
package pdf_read;

import java.io.*;

import org.apache.lucene.document.Document;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


/**
 * @author lucianiangelo
 *
 */
public class PdfReader {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidPasswordException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String contents = "";
		PDDocument doc2 = null;
		
		File file = new File("C:\\Users\\lucianiangelo\\Downloads\\java.pdf");
		Document doc = LucenePDFDocument.getDocument(file);
		doc.getFields();
	
	    doc2 = PDDocument.load(file);
	    PDFTextStripper stripper = new PDFTextStripper();

	    stripper.setLineSeparator("\n");
	    stripper.setStartPage(1);
	    stripper.setEndPage(5);// this mean that it will index the first 5 pages only
	    contents = stripper.getText(doc2);
	    String pippo = contents.toString();
	    if (pippo.contains("fondamenti"))
	    {
	    	System.out.println("preso");
	    }
	    else
	    {
	    	System.out.println("momoko");
	    }
	}

}
