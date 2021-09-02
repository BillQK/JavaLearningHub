public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();
        theStack.push(20, 2.99);
        theStack.push(40, 4.99);

        theStack.displayStack();

        theStack.push(60, 6.99);
        theStack.push(80, 8.99);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}
