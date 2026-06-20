class arrayReverse{
    public static void main(String[] args){
        //   ********  Reversing Partial Array   *******
        int[] logic = {11, 22, 33, 44, 55, 66, 77};

        int start = 0;
        int end = logic.length - 5;
        
        while(start < end){
            int temp = logic[start];
            logic[start] = logic[end];
            logic[end] = temp;

            start++;
            end--;
        }
        for(int number : logic){
            System.out.print(number +" ");
        }


       /*        ******  reversingh Middle Elements   *********
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        int start = 1;
        int end = arr.length - 2;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;

            start++;
            end--;
        }
        for(int values : arr){
            System.out.print(values + " ");
        }
       */


        //      ******   reversing all ELEMENTS In-side array *****
        /* 
        int[] numb = {10, 20, 30, 40, 50};
        
        int start = 0;
        int end = numb.length - 1;

        while(start < end){
            int temp = numb[start];
            numb[start] = numb[end];
            numb[end] = temp ;

            start++;
            end--;
        }
        for(int values : numb){
            System.out.print(values + " ");
        }

        */

    }
}