//! How Runtime Resolution Works:
// !When you have a superclass reference pointing to a subclass object, the overridden method in the subclass is called, even though the 
// !reference type is of the superclass. This decision about which method to invoke is made at runtime, depending on the actual object
// ! being referenced.x
class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display method in Child class");
    }
}
public class RunTimePoly {
    public static void main(String[] args) {
        Parent obj1 = new Parent();  // Reference and object are of type Parent
        Parent obj2 = new Child();   // Reference is of type Parent, but object is of type Child

        obj1.display();  // Calls Parent's display() method
        obj2.display();  // Calls Child's display() method
    }
}
