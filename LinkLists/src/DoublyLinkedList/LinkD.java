package DoublyLinkedList;

public class LinkD {
    public int iData;           // data item (key)
    public LinkD next;           // next link in list
    public LinkD previous;

    public LinkD(int id) {
        iData =id;
    }

    public void displayLink()
    {
        System.out.print("{" + iData + "} ");
    }
}

