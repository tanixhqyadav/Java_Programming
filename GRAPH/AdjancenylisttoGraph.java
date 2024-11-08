import java.util.ArrayList;

public class AdjancenylisttoGraph {
    public static void main(String[] args) {
        int ar[][]={
            {0,1,0,0},
            {0,0,1,0},
            {1,0,0,1},
            {0,1,1,0}
        };
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            ll.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i][j] == 1) {
                    ll.get(i).add(j);
                }
            }
        }
        System.out.println(ll);
    }
}
