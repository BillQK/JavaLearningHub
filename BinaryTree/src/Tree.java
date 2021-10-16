public class Tree {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();          // make new node
        newNode.iData = id;                 // insert data
        newNode.fData = dd;

        if (root == null) {                 // no node in root
            root = newNode;
        }
        else                                // root occupied
        {
            Node current = root;            // start at root
            Node parent;
            while (true) {                 // (exists internally)
                parent = current;
                if (id < current.iData) {  // go left?
                    current = current.leftChild;
                    if (current == null) {     // if end of the line,
                        // insert on left
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {                      // go right
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    } // end else go right
                }   // end while
            }  // end else not root
        } // end insert
    public void delete(int id) {

        // TODO: #####
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);

            System.out.println(localRoot.iData + " ");

            inOrder(localRoot.rightChild);
        }
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.iData + " ");

            preOrder(localRoot.leftChild);

            preOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);

            postOrder(localRoot.rightChild);

            System.out.println(localRoot.iData + " ");
        }
    }
   
}
