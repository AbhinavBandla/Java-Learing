class ArrayPrac{
    public static void main (String[] args){
        // #1
        int number[] = { 1 , 2, 3, 5, 16};
        //  #2
        int[] arr = {10, 20, 30, 40, 50};
        //  #3 
        int[] values = {12, 24, 36, 48, 60, 72};

        //#3

        System.out.println("Total Elements are  "+values.length);
        System.out.println("First index is : "+ 0);
        System.out.println("Last index is : "+ (values.length - 1));
        System.out.println("First Element is "+ values[0]);
        System.out.println("Last Element is : "+ values[values.length - 1]);
        System.out.println();


        //   #2
        System.out.println("Second Element is : " + arr[1]);
        System.out.println("Middle Element is : "+ arr[arr.length / 2]);
        System.out.println("Last Element "+arr[arr.length - 1]);

            System.out.println();
        //#1 
        System.out.println("First Element is : " + number[0]);
        System.out.println("Last Element is : "+ number[number.length-1]);
        System.out.println("The Length of an Array is "+number.length);
    }
}