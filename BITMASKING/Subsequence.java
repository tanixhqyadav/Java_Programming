public class Subsequence{
    public static void main(String[] args){
        String s='abc';
        Print(s);
    }
    public static void Print(String s){
        int n=s.length();
        for(int i=0;i<(1<<n);i++){
            Pattern(s,i);
        }
    }
    private static void Pattern(String s, int i){
        int pos=0;
        while(i>0){
            if((i&1)!=0){
                System.out.println(s.charAt(pos));
            }
            i>>=1;
            pos++;
        }
        System.out.println();
    }

}