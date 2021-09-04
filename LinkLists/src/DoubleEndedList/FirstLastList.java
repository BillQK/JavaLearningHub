package DoubleEndedList;

import SimpleLinkList.Link;

// Double-Ended Lists allows you to insert a new link directly at the end of the list
// !!Notice : Don't confuse the double-ended list with doubly linked list/.
public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        }
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
        System.out.println("");
    }

    public void displayListQueue() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
