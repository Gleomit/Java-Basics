import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class DeckOfCards 
{
	//File name
	private static String FILE = "DeckOfCards.pdf";
	 
	public static void main(String[] args) 
	{
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
		char[] suits = {'\u2663','\u2666','\u2665','\u2660'}; // suits unicode values
		try {
			Document document = new Document(PageSize.A5.rotate());
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
				
			float[] cellSize = {100f,100f,100f,100f}; 
			BaseFont bf = BaseFont.createFont("C:/windows/Fonts/Arial.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			PdfPTable table = new PdfPTable(4);
			Phrase phrase;
			Font tempFont;
			PdfPCell cell;

			for(char suit : suits)
			{
				for(String face : faces)
				{		
					if(suit == '\u2666' || suit == '\u2665')
						tempFont = new Font(bf,15f,Font.BOLD,BaseColor.RED);
					else
						tempFont = new Font(bf,15f,Font.BOLD,BaseColor.BLACK);
					
					phrase = new Phrase(face + " " + suit, tempFont);
					cell = new PdfPCell(phrase);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setBorderWidth(1.5f);
				    cell.setFixedHeight(150f);
				    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				    table.addCell(cell);
				}
			}
			table.setWidths(cellSize);
		    document.add(table);
			document.close();
		}
	    catch (Exception e) {
		}	
	}
}