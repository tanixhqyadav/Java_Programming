public class postpre {
    public static void main(String[] args){
        int a=6;
        int y=a++;//in actual  y value is 7 but it first assign then increase
        int z=++a;//it firat increase and then it assign
        System.out.println(y);
        System.out.println(z);
    }
}
