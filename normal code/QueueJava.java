//Implementation of ‘Queue’ Data-Structure in Java
import java.util.Arrays;

class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int currentIndex = -1;

    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[queueSize];
        Arrays.fill(queueArray, "-1");
    }

    public void enqueue(String newElement) {
        if (currentIndex + 1 < queueSize) {
            currentIndex++;
            queueArray[currentIndex] = newElement;
            System.out
                    .println("Enqueue : " + newElement + " is added to queue");
        } else {
            System.out.println("Queue is currently Full");
        }
    }

    public String dequeue() {
        if (currentIndex >= 0) {
            String toReturn = queueArray[0];
            System.out.println("Dequeue : " + queueArray[0]
                    + " is removed from the queue");
            for (int i = 0; i < queueArray.length - 1; i++) {
                queueArray[i] = queueArray[i + 1];
            }
            return toReturn;
        } else {
            System.out.println("Queue is currently empty");
            return "-1";
        }
    }

    public static void main(String args[]) {
        TheQueue queue = new TheQueue(10);
        queue.enqueue("Java");
        queue.enqueue("Programming");
        queue.enqueue("Language");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

}