import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class HashChainApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;

        System.out.print("Enter size of hash Table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        // make table
        HashTable theHT = new HashTable(size);

        for (int j = 0; j < n; j++) {
            aKey = (int)(java.lang.Math.random()
                    * keysPerCell * size);
            aDataItem = new Link(aKey);
            theHT.insert(aDataItem);
        }
        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("Show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice)
            {
                case 's' :
                    theHT.displayTable();
                    break;
                case 'i' :
                    System.out.print("Enter key value to insert ");
                    aKey = getInt();
                    aDataItem = new Link (aKey);
                    theHT.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value of delete: ");
                    aKey = getInt();
                    theHT.delete(aKey);
                    break;
                case 'f' :
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHT.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey );

                    }
                    else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default :
                    System.out.print("Invalid entry\n");
            }
        }

    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
