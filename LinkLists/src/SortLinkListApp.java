public class SortLinkListApp {
    public static void main(String[] args) {
        SortLinkList theSortedList = new SortLinkList();

        theSortedList.insert(30, 3.99);
        theSortedList.insert(20, 2.99);

        theSortedList.displayList();
        theSortedList.insert(50, 5.99);
        theSortedList.insert(70, 7.99);
        theSortedList.insert(60, 6.99);

        theSortedList.displayList();

        theSortedList.removeFirst();

        theSortedList.displayList();
    }
}
