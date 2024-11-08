public class singletonclasses {
    // ! Singleton classes are used in development point of view ex , At the time of database connectivity we 
    //!  connect the backend one time to th datatbase so  we make then private to be acesssd one time only 
    static int instance;
    private  singletonclasses{
        instance=10;
    }
    public int  getinstance(){
        if(instance==0){
            new singletonclasses();
        }
    }
    public static void main(String[] args) {
        
    }
}