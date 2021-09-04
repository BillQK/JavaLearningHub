public class LinkListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;

        Link[] linkArray = new Link[size];

        for (int j = 0; j < size; j++) {
            int id = (int) (java.lang.Math.random() * 99);
            double dd =  Math.round(java.lang.Math.random() * 99);

            Link newLink = new Link(id, dd);
            linkArray[j] = newLink;
        }

        System.out.println("Unsorted Array: ");
        for (int j = 0; j < size; j++) {
            System.out.print("{ " + linkArray[j].iData + ", " + linkArray[j].dData + "} ");

        }
        System.out.println();

        SortLinkList sortLinkList = new SortLinkList(linkArray);

        System.out.println("Sorted by ID Array: ");

        for (int j = 0; j < size; j++) {
            linkArray[j] = sortLinkList.removeFirst();
        }

        for (int j = 0; j < size; j++) {
            System.out.print("{ " + linkArray[j].iData + ", " + linkArray[j].dData + "} ");

        }

    }
}
