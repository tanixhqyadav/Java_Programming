public class Xhab_and_the_Xoceisrt {
    public static void main(String[] args) {
        int t = 1;
        int u = 3;
        solve(t, u);

    }
    public static void solve(int u , int v) {
        if(u>v || u%2 != v%2) {
            System.out.println(-1);
        }
        else if(u==0 && v==0) {
            System.out.println(0);
        }
        else if(u==v) {
            System.out.println(1);
            System.out.println(u);
        }
        else {
            int x = (v-u)/2;
            if((u&x) == 0) {
                System.out.println(2);
                System.out.println((u^x)+" "+x);
            }
            else {
                System.out.println(3);
                System.out.println(u+" "+x+" "+x);
            }
        }
    }
}
