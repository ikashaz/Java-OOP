package Day2;

public class variable {
    //class variable (static variable) the position is should in the class of object
    static int classvar=10;

    //instance variable
    int instant=20;

    public static void main(String[] args) {
        //local variable
        int localV=30;

        //accessing and modifying the class var
        System.out.println("class variable before modification :"+ classvar);
        classvar=50;
        System.out.println("class variable after modification :"+ classvar);

        //creating an instance of the class of instances var
        variable var=new variable();
        System.out.println("instance variable :"+ var.instant);

        //accesing local variable
        System.out.println("local variable :"+ localV);

        //invoking a method with parameter
        int sum= var.calculatesum(10,20);
        System.out.println("sum calculated in method :" +sum);

        System.out.println("instances value: "+var.instant);
        System.out.println("static value :"+ classvar);
        }

        public static int calculatesum (int a , int b){
        return a+b;
    }
}
