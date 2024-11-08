public class performance {
    public static void main(String[] args) {
        String s="";
        for(int i=1;i<=10;i++){
            s+=i;
        }
        //"" "1" "12" "123" so there are many operation thats why the performace of string is not good in java
        System.out.println(s);

    }
}
