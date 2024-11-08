import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class printing_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> qh = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            qh.add(q.poll());
            // q.poll();
        }
        System.out.println(qh);
    }
}
