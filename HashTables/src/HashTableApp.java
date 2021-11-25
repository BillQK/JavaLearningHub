import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HashTableApp {
    public static void main(String[] args) throws Exception {
        DataItem dataItem;
        int aKey, size, n , keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);

        for(int j = 0; j < n; j++) {
            aKey = (int) (java.lang.Math.random() * keysPerCell * size);
            dataItem = new DataItem(aKey);
            theHashTable.insert(dataItem);
        }

        while(true){
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayItem();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    dataItem = new DataItem(aKey);
                    theHashTable.insert(dataItem);
                    break;

                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                   dataItem =  theHashTable.find(aKey);
                    if (dataItem != null) {
                        System.out.println("Found : " + dataItem.getKey());
                    }
                    else {
                        System.out.println("Could not find: " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }
        }

    }

    public static String getString() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s= br.readLine();
        return s;
    }

    public static char getChar() throws Exception {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws Exception {
        String s = getString();
        return Integer.parseInt(s);
    }
}
