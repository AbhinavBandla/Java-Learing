class arrayMethod{
    
    static int largeElement(int[] b){
        int Large = Integer.MIN_VALUE;

        for(int x : b){
            if(x > Large){
                Large = x;
            }
        }
        return Large;
    }

    public static void doubleValues(int[] a){ 
    /*here We used void - doesn't return anything then how changed 
    *these are reference tyupe and we just modified so, no need tio return anything */

        for(int i = 0; i < a.length; i++){
            a[i] *= 2; 
        }
    }
    static void modifyArray(int[] arr){
        arr = new int[] {5, 10, 15};
        System.out.println("\nNew Array");
        for(int x : arr){
            System.out.print(x +" ");
        }
    }

    //  *********************************

    public static void main(String[] args){
        int[] arr = {10,20,30,40};

        System.out.print("Actual Array \t");
        for(int x : arr){
            System.out.print(x +" ");
        }

        modifyArray(arr);
        doubleValues(arr);
        System.out.print("\nDouble Array Values  ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("\n"+"Largest : "+largeElement(arr));

        
    }
}