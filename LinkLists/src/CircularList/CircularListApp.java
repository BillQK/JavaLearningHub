package CircularList;

public class CircularListApp {

    public static void main(String[] args) {
        CircularList theList = new CircularList();

        theList.insert(1);
        theList.insert(2);
        theList.insert(3);
        theList.insert(4);

        theList.moveNext();
        theList.insert(5);

        theList.displayList();

        theList.find(3);

        theList.deleteCurrent();
        theList.deleteCurrent();
        theList.displayList();
    }
}
