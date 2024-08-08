package c09_17;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        // QUEUE (FIFO):
        // ADD BACK: boolean add(E) (throws) / boolean offer(E)
        // READ FRONT: E element() (throws) / E peek()
        // GET and REMOVE FRONT: E remove() (throws) / E poll()

        // STACK (LIFO):
        // ADD FRONT: void .push(E)
        // REMOVE FRONT: E .pop()
        // READ FRONT E .peek()

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);
        System.out.println(queue);
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek: " + queue.peek());
        System.out.println(queue);
        queue.poll(); // []
        queue.remove(); // null
        queue.poll(); // NSEE!
    }

}
