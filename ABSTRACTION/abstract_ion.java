// ? Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// !it can be achived through two ways : 1 > through class and through interface
public abstract class  abstract_ion {
    // !A class which is declared with the abstract keyword is known as an abstract class in Java. 
    // !It can have abstract and non-abstract methods (method with the body).
    int x=100;
    public int viewbal(){
        return x;
    }
    abstract void printStatus();//no method body and abstract 
    // ! the implementation written by the class which is actually extendind the class 
}
