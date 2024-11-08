import java.util.*;
import java.util.LinkedList;

public class Deque_Basic {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(9);
        System.out.println(dq);
    }
}
