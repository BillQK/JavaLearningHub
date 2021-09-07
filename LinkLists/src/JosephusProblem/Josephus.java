package JosephusProblem;

import CircularList.CircularList;

public class Josephus {
    public static void main(String[] args) {
        CircularList theList = new CircularList();

        theList.insert(1);
        theList.insert(2);
        theList.insert(3);
        theList.insert(4);
        theList.insert(5);
        theList.insert(6);
        theList.insert(7);

        theList.find(1);

        while (theList.size() != 1) {
            theList.move(3);
            theList.deleteCurrent();

        }
        System.out.println();
        theList.displayList();

    }
}
