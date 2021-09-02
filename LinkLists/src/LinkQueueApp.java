public class LinkQueueApp {
    public static void main(String[] args)
    {
        LinkQueue theQueue = new LinkQueue();
        theQueue.insert(20, 2.99);
        theQueue.insert(40, 4.99);

        theQueue.displayQueue();
        theQueue.insert(60, 6.99);
        theQueue.insert(80, 8.99);
        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();
    }
}
