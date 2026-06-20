class OverFlow{
    public static void main(String[] args){
        // overFlow - Overflow happens when a value goes outside the range of a data type, -
        // - so Java wraps it to another value.
        byte a = 127;
        System.out.println("Before : "+ a);
        a++;
        System.out.println("After : "+a);
        System.out.println();

        byte b = -128;
        System.out.println("Before : "+b);
        b--;
        System.out.println("After : "+b);
        System.out.println(); 

        int num = 2147483647;
        System.out.println("Before : "+num);
        num++;
        System.out.println("After : "+num);
        System.out.println();


    }
}
/*
    *** what actually happen here is 
    For every data-type has it's own desired range example take byte - 1 byte - 8 bits.
    formula 
              2^(n-1) to 2^(n-1)-1;
              n = 8 ;
              2^(7) to 2^(7)-1;
              -128 to 127 max value = 127 and the Min value = -128

     so, now here what Java does is if we enter enter more than tha range it wrap 
     wraping means whan  the user enter's 128 it print -128 because java wraps it like 127+1 = -127 , if 128+1 = -126 
     same to min values to.. check byte b ,

*/