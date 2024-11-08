public class prct2 {
    static int MINIinaroataed(int ar[]) {
        int lo = 0;
        int hi = ar.length - 1;
        int n = ar.length - 1;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (ar[mid] > ar[n]) {
                lo = mid + 1;
            } else if (ar[mid] <= ar[n]) {
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arrra[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
        System.out.println(MINIinaroataed(arrra));
    }
}