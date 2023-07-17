package partie6;

import java.io.FileWriter;
import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		FileWriter myFile = null;
		try {
			myFile = new FileWriter("a_ecrire.txt");
		} catch (IOException e) {
			System.out.println("Le nom du fichier est vide ! ");
			System.exit(-1);
		}
		
		myFile.write("Voila ma premiere ligne dans un fichier");
		
		myFile.close();
	}

}
