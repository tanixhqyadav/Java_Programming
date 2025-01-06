public class AbstractionInjava {
    public static void main(String[] args) {
        
    }
}
//!Abstraction means hiding implementation in methos and in abstract class we canot create classes !!
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("Animals Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on four legs ");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    //! now by default we need to intilize walk hee also becuse it extends animal
    void walk(){
        System.out.println("walks on four legs ");
    }
}