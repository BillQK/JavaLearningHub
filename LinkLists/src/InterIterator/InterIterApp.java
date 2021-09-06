package InterIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList();          // new list
        ListIterator iter1 = theList.getIterator(); // new iter
        int value;

        iter1.insertAfter(20);                  // insert items
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (true) {
            System.out.print("Enter first letter of show, reset, " +
                    "next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();                 // get user's option

            switch (choice) {
                case 's':                           //show list
                    if (!theList.isEmpty()) {
                        theList.displayList();
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'r':                           // reset (to first)
                    iter1.reset();
                    break;
                case 'n':                          //  advance to next item
                    if (!theList.isEmpty() && !iter1.atEnd()) {
                        iter1.nextLink();
                    }
                    break;
                case 'g':                           // get current item
                    if (!theList.isEmpty() && !iter1.atEnd()) {
                        System.out.println("Returned " + iter1.getCurrent().iData);
                    }
                    break;

                case 'b':                           // insert before current item
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertBefore(value);
                    break;

                case 'a':                           // insert after current item
                    System.out.print("Enter value of insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertAfter(value);
                    break;

                case 'd':                           // delete current item
                    if (!theList.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Can't delete");
                    }
                    break;
                default:                            // Invalid Input
                    System.out.println("Invalid Entry");
            }

        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }//-------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    //-------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
//-------------------------------------------------------------
} // end class InterIterApp

////////////////////////////////////////////////////////////////


