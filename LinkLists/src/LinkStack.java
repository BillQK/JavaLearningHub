// A Stack implemented by a Linked List
public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public void push(int id, double dd) {
        theList.insertFirst(id, dd);
    }
    public Link pop() {
        return theList.deleteFirst();
    }
    public boolean isEmpty() {
        return (theList.isEmpty());
    }
    public void displayStack()
    {
        System.out.println("Stack (top-->bottom): ");
        theList.displayListStack();
    }

}

