package CircularList;

public class CircularListApp {

    public static void main(String[] args) {
        CircularList theList = new CircularList();

        theList.insert(1);
        theList.insert(2);
        theList.insert(3);
        theList.insert(4);

        theList.find(3);

        theList.displayList();

        theList.deleteCurrent();
        theList.deleteCurrent();
        theList.displayList();
    }
}
