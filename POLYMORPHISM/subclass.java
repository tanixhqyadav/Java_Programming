import java.sql.Time;

public class subclass extends superclass {
    // !what is Method Overriding ?
    // ? If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
    // !Run-Time Polymorphism is determined at runtime, allowing the method that gets executed to depend on the actual object's type, 
    // !even when the reference is of the parent type.
    @Override
    public  int sum(int a ,int b){
        return a+b;
    }
    // @Override
    // public void println(){
    //     System.out.println("Shambu Shankar!");
    // }
    public static void println(){
        System.out.print("hale luya>>>>>>>>>>>>>");
    }
    // ! we can not override a method which are final methods. In Java, you cannot override a method that is marked as final.
    public static void main(String[] args) {
        subclass kl=new subclass();
        // ?? the method sum is non static that, why it requires a instatnce of subclass tobe called
        System.out.println(kl.sum(10,29));
        println();
    }
}
