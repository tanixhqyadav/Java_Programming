import java.util.*;

public class mostFrequent {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 1, 3, 4, 5, 1, 1, 1, 2, 3, 9, 9, 9, 9, 9, 9 };
        int min = Integer.MIN_VALUE;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (mp.containsKey(ar[i])) {
                mp.put(ar[i], mp.get(ar[i]) + 1);
            } else {
                mp.put(ar[i], 1);
            }
            min = Math.max(min, mp.get(ar[i]));
        }
        System.out.println(min);
        int x = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() == min) {
                x = e.getKey();
            }
        }
        System.out.println(x);
    }
}
