package Queues;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue(6);

        queue.enqueue(9);
        queue.enqueue(11);

        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();
    }
}
