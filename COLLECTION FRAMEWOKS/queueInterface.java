import java.util.*;
public class queueInterface {
    static void queEXp(){
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> op =new ArrayList<>();
        op.add(8);
        op.add(78);
        op.add(23);
        op.add(7);
        q.add(1);
        q.add(99);
        q.add(9);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.addAll(op);
        q.offer(90);
        System.out.println(q);
    }
    static void Priorq(){
        PriorityQueue<Integer> kl= new PriorityQueue<>();// !by deafult min prioprity q is made 
        PriorityQueue<Integer> maxi= new PriorityQueue<>(Comparator.reverseOrder());// !by deafult min prioprity q is made but now how to make max pq
        maxi.add(5);
        maxi.add(6);
        maxi.add(7);
        maxi.add(8);
        maxi.add(0);
        System.out.println(maxi);
        kl.add(890);
        kl.add(89);
        kl.add(999);
        kl.add(90);
        System.out.println(kl);// * first 89 will be printed 89 because it gurantee about 1st elemnent in pq
        System.out.println(kl.poll());//* 899 remove hogya */
        System.out.println(kl.peek());//! ab 90 sbse chota hai toh 90 will be prior one
        System.out.println(kl);
        // kl.comparator();
    }
    static void Dacqa(){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        // ! deque provide flexibilty to add and remove from both the side in dqeue
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(9);
        System.out.println(dq);
    }
    public static void main(String[] args) {
        // queEXp();
        // Priorq();
        Dacqa();
    }
}
