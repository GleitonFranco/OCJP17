package c09_17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deques {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println(deque.peek()); // null
//        System.out.println(deque.remove()); // NÃO! NSEE!
        // ADD FIRST
        deque.addFirst("c"); // c
        boolean $offfisrt$ = deque.offerFirst("b"); // b c
        deque.push("a"); // a b c
        // ADD LAST
        boolean $offl$ = deque.add("w"); // a b c w     (true)
//        boolean $offl$ = deque.addLast("w"); // a b c w     (true)
        boolean $add$ = deque.offer("x"); // a b c w x     (true)
        boolean $off$ = deque.offerLast("y"); // a b c w x y     (true)
        deque.addLast("z"); // a b c w x y z
        // READ FIRST
        String peek = deque.peek(); // a b c x y z    (a)
        String peek2 = deque.peekFirst(); // a b c x y z    (a)
        String element = deque.element(); // a b c x y z   (a)
        String $get$ = deque.getFirst(); // a b c x y z   (a)
        // READ LAST
        String $last$ = deque.getLast(); // a b c x y z   (z)
        String $last2$ = deque.peekLast(); // a b c x y z   (z)
        // REMOVE FIRST
        String _sd = deque.pop(); // b c w x y z  (->a)
        String _sbb = deque.remove(); // c w x y z   (->b)
        String _sb = deque.poll(); // w x y z   (->c)
        String _sb2 = deque.pollFirst(); // x y z   (->w)
        // REMOVE LAST
        String sz = deque.removeLast(); // x y   (->z)
        String sy = deque.pollLast(); // x   (->y)
        deque.clear(); // []
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekLast());
//        System.out.println(deque.getFirst()); // RTE! NSEE!
//        System.out.println(deque.element()); // RTE! NSEE!
        System.out.println(deque.poll());
//        System.out.println(deque.remove()); // RTE! NSEE!
//        System.out.println(deque.pop()); // RTE! NSEE!

        // QUEUE (FIFO)
        // ADD BACK: boolean add(E) (throws) / boolean offer(E)
        // READ FRONT: E element() (throws) / E peek()
        // GET and REMOVE FRONT: E remove() (throws) / E poll()

        // DEQUE (DOUBLE ENDED QUEUE)
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Deque.html
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayDeque.html
        // ADD BACK:  void addLast(E) (throws), boolean offerLast(E)
        // ADD FRONT: void addFirst(E) (throws), boolean offerFirst(E)
        // READ FIRST: E getFirst() (throws), E peekFirst()

        // STACK (LIFO):
        // ADD FRONT: void .push(E)
        // REMOVE FRONT: E .pop()
        // READ FRONT E .peek()

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
