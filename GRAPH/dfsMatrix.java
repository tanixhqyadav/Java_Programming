import java.util.*;

public class dfsMatrix {
    public static void main(String[] args) {
        int ar[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        boolean bola[][]=new boolean [ar[0].length][ar.length];
        dfs(ar,0,0,bola);
    }
    public static void dfs(int[][] mat,int row,int col,boolean visited[][]){
        visited[row][col]=true;
        System.out.println(mat[row][col]);
        int di[]={0,1,0,-1};
        int dj[]={1,0,-1,0};
        for (int i = 0; i < 4; i++) {
            int nbr_x=row+di[i];
            int nbr_y=col+dj[i];
            if(nbr_x>=0 && nbr_x < mat.length && nbr_y >= 0 && nbr_y < mat[0].length && !visited[nbr_x][nbr_y]){
                dfs(mat,nbr_x,nbr_y,visited);
            }
    }
}

    // public static void dfs(int ar[][],int i,int j,int v ,int h,boolean bola[][] ,String ans){
    //     if(i==v && h==j){
    //         System.out.println(ans + " (" + i + "," + j + ")");            
    //         return ;
    //     }
    //     if (i < 0 || j < 0 || i >= ar.length || j >= ar[0].length || bola[i][j]) {
    //         return;
    //     }
    //     bola[i][j]=true;
    //     dfs(ar, i, j + 1, v, h, bola, ans + " (" + i + "," + j + ")");
    //     dfs(ar, i + 1, j, v, h, bola, ans + " (" + i + "," + j + ")");
    //     dfs(ar, i, j - 1, v, h, bola, ans + " (" + i + "," + j + ")");
    //     dfs(ar, i - 1, j, v, h, bola, ans + " (" + i + "," + j + ")");
    //     bola[i][j]=false;
    // }
}
