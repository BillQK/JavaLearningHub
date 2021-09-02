public class FirstLastApp {

    public static void  main(String[] args)
    {
        FirstLastList theList = new FirstLastList();

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66,6.99);

        theList.insertLast(11, 1.99);
        theList.insertLast(33, 3.99);
        theList.insertLast(55,5.99);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();

    }
}
