public  class Student{
        String name;
        int age;
        double percent;

        //>STATIC KEYWORD IS FORMED FOR PRESENT UPDATION AND FUTURE UPDATIO IN THE BOX it can be said as a gobalize variable to
        //  SO we can use private satatic now we can use getter to acess it
        private static int noofstudent;
        public static int getnoofstudent(){
            return noofstudent;
        }

        // final keyword is used to make any attribute immutable 
        final String schoolname="dps";
        
        
        public static int fac( int x){
            int p=1;
            for(int i=1;i<=x;i++){
                p*=i;
            }
            return p;
        }
        public Student(){
            // it is default conustrator with zero arguements
        }
        public Student(String naam , int umar, double marks){
            name=naam;
            age=umar;
            percent=marks;
            noofstudent++;
        }


        // see the use of this keyword without this it is giving everything null and 0 because its is refering to itself only;
        // public Student(String name , int age, double percent){
        //     this.name=name; internally 
        //     this.age=age;
        //     this.percent=percent;
        // }
    }