import java.util.*;
class roman {
    static  int romanToInt(String str) {
    char ar[]=str.toCharArray();
       int s=0;
       for(int i=0;i<ar.length;i++){
           if(ar[i]=='I'){
               s+=1;
           }
           else if(ar[i]=='V'){
               s+=5;
           }
           else if(ar[i]=='X'){
               s+=10;
           }
           else if(ar[i]=='L'){
               s+=50;
           }
           else if(ar[i]=='C'){
               s+=100;
           }
           else if(ar[i]=='D'){
               s+=500;
           }
           else if(ar[i]=='M'){
               s+=1000;
           }
           
        }
        return s;
}
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        String s=jk.next();
        System.out.println(romanToInt(s));
    }
}