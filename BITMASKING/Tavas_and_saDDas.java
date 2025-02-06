public class Tavas_and_saDDas{
    public static void main(String args[]){
        String s="47";
        System.out.println(Index(s));

    }
    public static int Index(String s){
        int n=s.length();
        int c=(1<<n)-2;
        int pos=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='7'){
                c+=(1<<pos);
            }
            pos++;
        }
        return c+1;
    }
}