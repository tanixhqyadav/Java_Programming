public class acessmodifiers {
    public static void main(String[] args) {
        // with in the class we can acess this idnumber number 
        rano okay =new rano();
        okay.naam="nasa.com";
        okay.nasa=999;
        
        // git check
        //FINAL KEYWORD
        Student p=new Student();
        //p.schoolname="bbps";//it cannot be changed because of final keyword
        System.out.println(p.schoolname);


        
        okay.setidnumber(78);// this is private in class rano but can be set using setidnumber()
        // but here idnumber not coming because we are using as private
        System.out.println(okay.nasa);
        System.out.println(okay.getidnumber());


    }
}
