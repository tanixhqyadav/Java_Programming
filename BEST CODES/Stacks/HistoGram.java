import java.util.Stack;

public class HistoGram {
    public static void main(String[] args) {
        int araay[] = { 2, 3, 5, 4, 6, 1, 7 };
        System.out.println(Area(araay));
    }

    public static int Area(int araa[]) {
        Stack<Integer> sta = new Stack<>();
        int ans = 0;
        for (int i = 0; i < araa.length; i++) {
            while (!sta.isEmpty() && araa[i] < araa[sta.peek()]) {
                int h = araa[sta.pop()];
                int r = i;
                if (!sta.isEmpty()) {
                    int l = sta.peek();
                    ans = Math.max(ans, h * (r - l - 1));
                } else {
                    ans = Math.max(ans, h * r);
                }
            }
            sta.push(i);
        }
        int r=araa.length;
        while (!sta.isEmpty()) {
            int h = araa[sta.pop()];
            if (!sta.isEmpty()) {
                int l = sta.peek();
                ans = Math.max(ans, h * (r - l - 1));
            } else {
                ans = Math.max(ans, h * r);
            }
        }
        return ans;
        
    }
}
