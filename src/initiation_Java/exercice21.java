package initiation_Java;

public class exercice21 {
    public static void main(String[] args) {
        short Ayoub_Array[]; // codage sur 2 octets
        Ayoub_Array = new short[5];

        Ayoub_Array[0] = 200;
        Ayoub_Array[1] = 20;
        Ayoub_Array[2] = 2;
        Ayoub_Array[3] = 20;
        Ayoub_Array[4] = 200;

        char charArray[];
        charArray = new char[5];

        charArray[0] = 'A';
        charArray[1] = 'y';
        charArray[2] = 'o';
        charArray[3] = 'u';
        charArray[4] = 'b';
        
        afficheTableau(charArray);
        afficheTableauShort(Ayoub_Array);
    }

    public static void afficheTableau(char[] tab) {
        for (char current : tab) {
            System.out.println(current);
        }
    }
    public static void afficheTableauShort (short [] tab) {
    	for (short current : tab) {
    		System.out.println(current);
    	}
    }
}
