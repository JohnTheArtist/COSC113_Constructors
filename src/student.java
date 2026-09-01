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


    public static void main(String [] args){


        // If constructors are not defined JVM will provide a default constructor
        student s1 = new student();
        System.out.println(s1);

        // use of the dot operator "."
        System.out.println( "First name: " + s1.FN);
        System.out.println("Hello Constructors");



    }





}
