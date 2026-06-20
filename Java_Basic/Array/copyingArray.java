class copy {
    public static void main(String[] args){

        // copying only the Even index values 
        int[] len = {10, 20, 30, 40, 50};
        int[] cpy = new int[len.length];

        for(int i = 0; i < len.length; i++){
            if(i % 2 == 0){
                cpy[i] = len[i];
            }
        }

        for(int cool : cpy){
            System.out.print(cool + " ");
        }
        System.out.println();

        // reference Array take len array 

        int[] valu = len;

        valu[4] = 999;
        for(int call : len){
            System.out.print(call+" ");
        }

        



        /* 
        //  ******* Copying and reversing an Array   ***********
        int[] values = {1, 2, 3, 4, 5};

        int[] copy2 = new int[values.length];

        System.out.println("Original Array");
         for(int m : values){
            System.out.print(m +" ");
        }

        System.out.println("\nCopy Array");
        for(int i = 0; i < values.length; i++){
            copy2[i] = values[i];
            System.out.print(copy2[i] + " ");
        }

        int start = 0;
        int end = copy2.length -1;

        while(start < end){
            int temp = copy2[start];
            copy2[start] = copy2[end];
            copy2[end] = temp;

            start++;
            end--;
        }
        System.out.println("\nReverse copy Array ");
        for(int n : copy2){
            System.out.print(n+" ");
        }
        */

    
        /*
        //    ******** copying and overriding the elements In copy array 
        
        int[] arr = {10, 20, 30, 40};

        int[] copy = new int[arr.length];
        System.out.println("Original Array");
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCopy Array");
        for(int ele : copy){
            System.out.print(ele + " ");
        }
        System.out.println("\nArray After override");
        copy[2] = 999;
        for(int ele : copy){
            System.out.print(ele + " ");
        }
        */
    }
}