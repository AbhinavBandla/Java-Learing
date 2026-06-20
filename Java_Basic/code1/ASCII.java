class Ascii{
    public static void main(String[] args){
        //A char literal can be assigned directly to an int, 
        // and Java stores its ASCII/Unicode value.
        int key = 'C';
        int value1 = 'A';
        int value2 = '7';
        int value3 = 'b';

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(key);
        System.out.println();

        //    *************     UNICODE    *************    
        /* 
         ASCII is limited and supports only a small set of characters. Unicode supports 
         many more characters, and ASCII is included inside Unicode.
        */
           
        int v1 = 'A';
        int v2 = '₹';

        System.out.println("A : " + v1);
        System.out.println("₹ : " + v2);
        System.out.println();

        char ch1 = '\u0041';
        char ch2 = '\u20B9';

        System.out.println(ch1);
        System.out.println(ch2);
    }
}
/* 
        A = 65 B = 66  ............. Z = 90;    lowercase = upperCase + 32;       which is lower a = upper A 65 + 32 = 97;
        a = 97 b = 98 .............. z = 122;
        0 to 9 = 48 to 57; 
        space = ' ' - 32 
*/