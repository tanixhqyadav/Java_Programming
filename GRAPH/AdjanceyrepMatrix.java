import java.util.*;
public class AdjanceyrepMatrix {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int n=jk.nextInt();
        int v=jk.nextInt();
        int mat[][]=new int[n][n];
        while (v-->0) {
            int i=jk.nextInt();
            int j=jk.nextInt();
            mat[i][j]=1;
            mat[j][i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
