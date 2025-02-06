import java.util.*;
// !2360 leetcode
public class juspay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Hello, World!");
    }
    public static int LargestSum(int ed[],int n){
        int []indegree = new int[n];
        for(int i=0;i<n;i++){
            if(ed[i]!=-1){
                indegree[ed[i]]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }   
        while(!que.isEmpty()){
            int rv=que.poll();

        }
    }
}