import java.util.*;

public class removeConsecutiveSubsequence {
    public static void show(int ar[]) {
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,1};
        show(ar);
        Stack<Integer> op = new Stack<>();
        for(int i=0; i<ar.length; i++) {
            if(op.isEmpty() || op.peek() != ar[i]) {
                op.push(ar[i]);
            }
            else if(ar[i] != ar[i - 1]) {
                op.pop();
        }
        int hr[] = new int[op.size()];
        for(int j=hr.length-1; j>=0; j--) {
            hr[j] = op.pop();
        }
        show(hr);
    }
}
}
