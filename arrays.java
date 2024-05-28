public class arrays {
    public static void main(String[] args) {
        //declaration and initialize
        int[] arrayS= {1,2,3,4,5};
        int[] num2=new int[5];//initialize array with size

        //accessing element
        int F=arrayS[0]; //accesing element in array
        int arrlength=arrayS.length;//array length is 5

        //iteration
        System.out.print("The Array values: ");
        for(int x=0;x<arrlength;x++) {
            System.out.println(arrayS[x]);
        }

        //2D array
        int[][] array2={{1,2,3},{4,5,6},{7,8,9}};
        int element2= array2[0][1];

        //output
        System.out.println("the result of 2D array is " + element2);
        System.out.println("the first element of Array is :"+ F);
        System.out.println("the length of the array is :"+ arrlength);

    }
}
