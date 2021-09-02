public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(int id, double dd) {
        theList.insertLast(id, dd);
    }

    public Link remove()
    {
        return theList.deleteFirst();
    }
    public void displayQueue() {
        System.out.println("Queue (front-->rear): ");
        theList.displayListQueue();

    }

}
