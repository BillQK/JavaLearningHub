package CircularList;

public class CircularList {
    private Link current;
    private int nElems = 0;

    public CircularList() {
        current = null;
    }

    public boolean isEmpty() {
        return (current == null);
    }

    public void insert(int id) {
        Link newLink = new Link(id);

        if (isEmpty()) {
            newLink.next = newLink;
            current = newLink;
            nElems++;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            current = newLink;
            nElems++;
        }
    }

    public Link deleteCurrent() {
        Link l = current;

        if (l.next == current) {
            current = null;
            nElems--;
        } else {
            while (l.next != current) {
                l = l.next;
            }
            l.next = current.next;
            current = l;
            nElems--;
        }
        return l;
    }

    public void moveNext() {
        current = current.next;
    }

    public void find(int key) {
        int counter = 0;
        while (counter != nElems) {
            if (key == current.iData) {
                System.out.println("Found " + key);
                counter++;
            } else {
                current = current.next;
                counter++;
            }
        }
        System.out.println("Not Found " + key);
    }

    public void displayList() {
        System.out.println("List (First --> Last): ");
        int counter = 0;
       while (counter != nElems) {
           if (current != null) {
               current.displayLink();
               current = current.next;
               counter++;
           }
           else {
               System.out.println();
           }
       }
    }
}
