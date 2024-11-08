public class outer_inner {
    class zanishq {
        String naam;
        int cola;
    }
    public static void main(String[] args) {
        // Create an instance of the outer class
        outer_inner outerInstance = new outer_inner();
        
        // Create an instance of the inner class using the outer class instance
        zanishq innerInstance = outerInstance.new zanishq();
        
        // Now you can access the inner class instance
        innerInstance.naam = "Example";
        innerInstance.cola = 123;

        System.out.println("Name: " + innerInstance.naam);
        System.out.println("Hola: " + innerInstance.cola);
    }
}
