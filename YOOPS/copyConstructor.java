public class copyConstructor{
    public static void main(String[] args) {
        Car c1=new Car("bmw", 1867);
        Car c2=new Car(c1);//use of copy constructor 
    }
}
class Car{
    String model;
    int modelno;
    private int carNo;
    // !Copy Consutructor 
    Car( Car c1){
        this.modelno=c1.modelno;
        this.model=c1.model;
    }
    Car(String model, int modelNo){
        this.model=model;
        this.modelno=modelNo;
    }
    public int getcarNo(){
        return carNo;
    }
    public void setcarNo(int carNo){
        this.carNo=carNo;
    }
}