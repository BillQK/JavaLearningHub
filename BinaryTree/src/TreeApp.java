public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.7);
        theTree.insert(70, 1.9);

        Node found = theTree.find(25);
        if (found != null) {
            System.out.println("Found the with key 25");

        }
        else {
            System.out.println("Could not find node with key 25");
        }
    }

}
