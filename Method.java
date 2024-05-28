package Day2;

public class Method {
    //method without return value and parameter
    public static void greet() {
        System.out.println("Hello World!");
    }

    //method with return value and parameter
    public static int add(int a, int b) {
        return a + b;
    }

    //method with return value and no parametr
    public static double getPi(){
        return 3.14;
    }

    //method with no return value and parameter
    public static void printdetails(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        //calling greet method
        greet();

        //calling the add method
        int sum= add(5,3);
        System.out.println("the addition results: "+sum);

        //calling getPi Method
        double pi=getPi();
        System.out.println(pi);

        //calling print method
        printdetails("laila",12);


    }
}
