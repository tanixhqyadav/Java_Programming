
public class static_polymorphism {
    // !This concept is called method overloading 
    // ?If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
    // !we change argumnets in method overloading and even data types
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }

    public double add(double a, double b,double c, double d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        static_polymorphism ob=new static_polymorphism();
        System.out.println(ob.add(2,10));
        System.out.println(ob.add(2,10,34));
        System.out.println(ob.add(2.0,10.0,78.0,22.0));
    }
    // !! Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
    // ! But JVM calls main() method which receives string array as arguments only.
    public static void main(String[] args){System.out.println("main with String[]");}  
    public static void main(String args){System.out.println("main with String");}  
    public static void main(){System.out.println("main without args");}  
}
