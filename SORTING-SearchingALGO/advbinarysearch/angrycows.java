import java.util.*;

public class angrycows {
    public static void main(String[] args) {
        int stall[] = { 1, 2, 8, 4, 9 };
        int nocows = 3;
        int hi = stall[stall.length - 1]-stall[0];
        Arrays.sort(stall);
        System.out.println(largestdistance(stall, nocows));
        // Scanner jk=new Scanner(System.in);
        // int t=jk.nextInt();
        // while(t-->0){
        // int n=jk.nextInt();
        // int nocows=jk.nextInt();
        // int stall[]=new int[n];
        // for(int i=0;i<n;i++){
        //     stall[i]=jk.nextInt();
        // }
        // Arrays.sort(stall);
        // System.out.println(largestdistance(stall, nocows));
        // }
    }

    static int largestdistance(int stall[], int nocows) {
        int lo = 1;
        int hi = stall[stall.length - 1]-stall[0];
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isitpossible(stall, nocows, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int stall[], int nocows, int mid) {
        int pos = stall[0];
        int c = 1;
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - pos >= mid) {
                c++;
                pos = stall[i];
            }
            if (c == nocows) {
                return true;
            }
        }
        return false;
    }

}
