public class typecasting {
    public static void main(String[] args) {
        //explicit casting besar ke kecik
        double d=10.5;
        int i =(int) d;
        System.out.println(i);

        //implicit casting kecik ke besar based on bit size of datatype
        int num=10;
        double numd=num;
        System.out.println(num);
        System.out.println(numd);

    }
}
