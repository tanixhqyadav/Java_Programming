class an{
    int db;
    String hj;
    public static void print_karado(String hj){
        for(int i=0;i<=5;i++){
            System.out.println("Happy Holi");
        }
    }
    public an(int db, String hj){
        db=this.db;
        hj=this.hj;
    }
    private static int dob;
    public  static int getdob(){
        return dob;
    }
}
public class revOops{
    public static void main(String[] args) {
        an sex=new an(999, "fucking bitch");
        System.out.println(sex.db);

    }
}