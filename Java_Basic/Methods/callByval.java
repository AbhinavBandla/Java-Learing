class callByValue{
    // call by Value means passing the value copy to the method parameter

    //Call by value is a parameter-passing method where the actual value of an argument is copied into a function's formal parameter

    //1st 
    static void increase(int num){
        num+=10;
        System.out.println("num "+num);
    }
    static void multiple(int n){
        n*=3;
        System.out.println("n is "+n);
    }
    //2nd *******
    // value swapping 
    static void swap(int x, int y){
        int temp = x;//10
        System.out.println("before swamp x is "+ x);
        System.out.println("before swamp y is "+ y);
        System.out.println();
        x=y;
        y = temp;
        System.out.println("After swamp x is "+ x);
        System.out.println("After swamp y is "+ y);
    }
    //  &&&&&&&&&   3rd  &&&&&&&&&
    static boolean isEven(int num){
        if (num % 2 ==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){


       /*  int x = 20;
        increase(x);
        System.out.println("x "+x);

        */
       /* 
       int value = 4;
       System.out.println("value is "+value);
       multiple(value);
       System.out.println("value is "+value);
        */

       /* 
       int a = 10;
       int b = 20;
        System.out.println("before call a is "+ a);
        System.out.println("before call b is "+ b);
        System.out.println();
        swap(a,b);
        System.out.println();
        System.out.println("After call a is "+ a);
        System.out.println("After call b is "+ b); 
        */

        
    }
}