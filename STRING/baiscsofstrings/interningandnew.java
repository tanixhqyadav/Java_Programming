
public class interningandnew {
    public static void main(String[] args) {
        String x="hello";
        String s="hello";
        s="mello";
        System.out.println(s);
        // you can not change string in java but 
        s=s.substring(0, 2)+'y'+s.substring(3);//meylo
        // still there is a new string formed  still there is no change inly pointing change from mello to meylo in heap
        System.out.println(s);
    }
}
