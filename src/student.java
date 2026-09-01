public class student {


    String FN;
    String LN;
    int ID;



    // this is a static method
    // methods can be static and non static
    //void  returns nothing
    // return types are int, float, double, String, char
    //method name = main


    // JVM access the static method using ClassName.MethodName


    //constructors dont have any return type
    //constructors must have the same name as the class name
    //constructors are useful for initialization


    student() {
        FN = "John";
        LN = "Jonas";
        ID = 230;



    }

    student ( String FN, String LN, int ID ){
        this.FN = FN;
        this.LN = LN;
        this.ID = ID;
    }

    static void main(String [] args){


        // If constructors are not defined JVM will provide a default constructor
        student s1 = new student();
        System.out.println(s1);

        student s2 = new student();

        student s3 = new student("James" , "John", 211);

        // use of the dot operator "."
        System.out.println( "First name: " + s1.FN);

        System.out.println( "First name: " + s2.FN);

        System.out.println( "First name: " + s3.FN);

        System.out.println("Hello Constructors");



    }





}
