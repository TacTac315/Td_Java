package partie6;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
public class Exercice62 {
	public static void main(String[] args) {
		
		Document document = new Document();
		document.addAuthor("Vincent");
		document.addCreationDate();
		document.addTitle("premier document");
		try {
			FileOutputStream fos = new FileOutputStream("fichier1.pdf");
			PdfWriter.getInstance(document, fos);
			document.open();
			document.add(new Paragraph("paragraphe 1 alight"));
			document.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (DocumentException de) {
			System.err.println(de.getMessage());
		}
	}

}
