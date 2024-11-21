import java.util.Arrays;
import java.util.Scanner;

public class a10_minimum_smoke {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// //int t = sc.nextInt();
		// while(sc.hasNext()) {
		// int n = sc.nextInt();
		// int mix [] = new int [n];
		// for (int i = 0; i < mix.length; i++) {
		// 	mix[i]=sc.nextInt();
		// }
		int mix[]={40,60,20,10,5};
		int[][] dp = new int[mix.length][mix.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Mix_MCM(mix, 0, mix.length-1,dp));
		}

	}
	public static int Mix_MCM(int [] mix, int si, int ei,int [][]dp) {
		if(si==ei) {
			return 0;
		}
		
		if(dp[si][ei]!=-1) {
			return dp[si][ei];
		}
		int ans = Integer.MAX_VALUE;
		for (int k = si; k <= ei-1; k++) {
			int fs = Mix_MCM(mix, si, k,dp);// 00
			
			int ss = Mix_MCM(mix, k+1, ei,dp);
			
			
			int sw=color(mix, si, k)*color(mix, k+1, ei);//12
			int total = fs+ss+sw;
			
			ans=Math.min(ans, total);
		}
		return dp[si][ei]=ans;
		
	}
	public static int color(int [] mix, int si, int ei) {
		int sum=0;
		for (int i = si; i <=ei; i++) {
			sum+=mix[i];
		}
		
		return	sum%100;
	}
}