import java.util.*;

public class basic {
    public static void main(String[] args) {
        // Queue<Integer> q=new Queue<>();//error: Queue is abstract; cannot be
        // instantiatederror: Queue is abstract; cannot be instantiated
        // so we can write ArrayDeque or LinkedList
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> qt = new Stack<>();
        // Queue<Integer> qL = new LinkedList<>();
        qt.push(1);
        qt.push(2);
        qt.push(3);
        qt.push(4);
        qt.push(5);
        qt.pop();
        System.out.println(qt);
        //
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);// we can remove element using poll
        q.poll();
        System.out.println(q);
        System.out.println(q.element());// gives the top most elemennt
    }
}