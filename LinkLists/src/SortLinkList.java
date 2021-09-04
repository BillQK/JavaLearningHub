public class SortLinkList {
    private Link first;


    public SortLinkList() {
        first = null;
    }

    public SortLinkList(Link[] linkArr) {
        first = null;
        for (Link link : linkArr) {
            insert(link);
        }
    }

    private void insert(Link link) {
        Link previous = null;
        Link current = first;

        while (current != null && (link.iData > current.iData)) {
            previous = current;
            current = current.next;

        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int id, double dd) {
        Link newLink = new Link(id, dd);
        Link current = first;
        Link previous = null;

        while (current != null && (id > current.iData)) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;

        }
        newLink.next = current;
    }

    public Link removeFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
