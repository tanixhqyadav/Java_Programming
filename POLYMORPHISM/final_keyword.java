public class final_keyword {
    // !The final keyword in java is used to restrict the user.
    // !The final keyword can be applied with the variables, a final variable that have no value it is called blank 
    // !final variable or uninitialized final variable. 
    // !It can be initialized in the constructor only. The blank final variable can be static also which will be initialized 
    // !in the static block only.
    // ? final method canonot be ovveridden 
    // ? final class canot be extend
    // !Can we initialize blank final variable?  
    // !Yes, but only in constructor.
}
// How Runtime Resolution Works:
// When you have a superclass reference pointing to a subclass object, the overridden method in the subclass is called, even though the 
// reference type 
// is of the superclass. This decision about which method to invoke is made at runtime, depending on the actual object being referenced.x