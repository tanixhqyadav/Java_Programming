import java.util.Stack;

public class UnderflowAndOverflow {
    public static void main(String[] args) {
        Stack<Integer> ll = new Stack<>();
        ll.push(1);
        ll.push(2);
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        ll.pop();// will give stack empty execption
        System.out.println(ll);
    }
}
