package partie6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestIO2 {

	public static void main(String[] argv) {
		System.out.print("Veuillez saisir votre nom :");
		String inputLine = " ";
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			is.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		if (inputLine !=null) {
			System.out.print("Votre nom est " + inputLine);
		}
	}

}
