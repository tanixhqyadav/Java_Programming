// package Java_Programming.INHERITENCE;

public class inheritence_demo {
    public static void main(String[] args) {
        parent baccha=new parent();
        children boy=new children();
        System.out.println(baccha.a);
        // System.out.println(((children) baccha).d);//! childrem mein jaake dekho 
        baccha.priint();
        boy.priint();
        boy.dikao();
    }
}
