import java.util.*;
public class bfsMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        bfs(arr,0,0); 
    }
    public static void bfs(int arr[][],int r,int c){
        boolean vis[][]=new boolean[arr.length][arr[0].length];
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{r,c});
        vis[r][c]=true;
        while(!q.isEmpty()){
            int []curr=q.poll();
            int currx=curr[0];
            int curry=curr[1];
            System.out.println("{"+currx+","+curry+"}");
            int dx[]={0,1,0,-1};
            int dy[]={1,0,-1,0};
            for(int i=0;i<4;i++){
                int nbrx=currx+dx[i];
                int nbry=curry+dy[i];
                if(nbrx>=0 && nbrx<arr.length && nbry>=0 && nbry<arr[0].length && !vis[nbrx][nbry]){
                    q.add(new int[]{nbrx,nbry});
                    vis[nbrx][nbry]=true;
                }
            }
    }    }
}
