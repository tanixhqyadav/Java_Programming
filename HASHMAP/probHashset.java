import java.util.*;
public class probHashset{
    public static void main(String[] args) {
        HashSet<Integer> hp=new HashSet<>();
        int ar[]={2,1,2,1,3,3};
        int max=Integer.MIN_VALUE;
        for(int  i=0;i<ar.length;i++){
            if(hp.contains(ar[i])){
                hp.remove(ar[i]);
            }else{
                hp.add(ar[i]);
            max=Math.max(hp.size(),max);
            }
        }
        System.out.println(max);
    }
}