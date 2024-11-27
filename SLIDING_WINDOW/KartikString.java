public class KartikString {
    public static void main(String[] args) {
        String s="ababbbaa";
        int k=2;
        int flip_a=karStr(s,k,'a');
        int flip_b=karStr(s,k,'b');
        System.out.println(Math.max(flip_a, flip_b));
        // !Good Pattern 
    }
    public static int karStr(String s , int k, char ch){
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while(ei<s.length()){
            if(s.charAt(ei)==ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
