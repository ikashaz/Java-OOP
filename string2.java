public class string2 {
    public static void main(String[] args) {
        //creation
        String str1="hello";//using string literal
        String str2= new String("world");//using string constructor
        str1=str1+" "+str2;
        System.out.println(str1);

        //immutability
        String str3= str1 +" "+ str2;//using + operator
        String str4 =str1.concat(" ").concat(str2);//using concat method

        //string length
        int length=str1.length();

        //accesing characters
        char Fc=str1.charAt(0);

        //comparison
        boolean isEqual=str1.equals(str2);
        boolean isSame=str1==str2;

        //substring
        String substring=str1.substring(3);








    }
}
