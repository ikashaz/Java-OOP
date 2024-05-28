public class wrapper {
    public static void main(String[] args) {
        //conversion
        int primitiveInt=10;
        Integer wrapInt= Integer.valueOf(primitiveInt);
        int backtoint= wrapInt.intValue();//convert Integer to int
        System.out.println("converted in :"+backtoint);

        //double primitive
        double dprim=20.8;
        Double wrapD=Double.valueOf(dprim);
        double backtoDouble=wrapD.doubleValue();
        System.out.println("converted in: "+ backtoDouble);

        //utility method in java
        String numStr="123";
        int parseInt=Integer.parseInt(numStr);//parse string to int
        System.out.println(numStr);

        int compareRes=Integer.compare(10,5); //compare 2 int if p1 bigger than p2 result 1,if less than -1 n while same its 0
        System.out.println("Result for compare is 10,5 :"+compareRes);

        int compareRes2=Integer.compare(1,5); //compare 2 int if p1 bigger than p2 result 1,if less than -1 n while same its 0
        System.out.println("Result for compare is 1,5 :"+compareRes2);

        int compareRes3=Integer.compare(5,5); //compare 2 int if p1 bigger than p2 result 1,if less than -1 n while same its 0
        System.out.println("Result for compare is 5,5 :"+compareRes3);

        String binaryString=Integer.toBinaryString(10); //convert int to binary
        System.out.println(binaryString);

        //null
        Integer nullableint=null;
        System.out.println("the value of null is :"+ nullableint);

    }
}
