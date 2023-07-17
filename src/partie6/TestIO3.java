package partie6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO3 {

	public static void main(String[] args) throws IOException{
		FileReader in=null;
		FileWriter out;
		try {
			try {
				in = new FileReader("a_lire.txt");
			}catch (IOException r) {
				System.out.println("Le fichier à lire n'existe pas !");
				System.exit(-1);
			}
			out = new FileWriter("a_ecrire2.txt");
			int c;
			while ((c = in.read()) !=-1) {
				out.write(c);
			}
			in.close();
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}


	}

}
