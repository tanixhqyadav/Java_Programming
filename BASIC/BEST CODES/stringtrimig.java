public class stringtrimig {
    public static void main(String[] args) {
        String s=" a good   example   ";
        // trim function is used to remove the space from age nad piche not between
        // System.out.println(s.length());
        // s=s.trim();
        // System.out.print(s);
        // System.out.println(s.length());
        String k=reverseWords(s);
        System.out.println(k);
        // here "s\+" is used to split with multiple spaces

    }
    static String reverseWords( String s){
        s=s.trim();
        String ar[]=s.split("\s+");
        String ans="";
        for(int i=ar.length-1;i>=0;i--){
            ans=ans+ar[i]+" ";
        }
        return ans.trim();
    }
}
