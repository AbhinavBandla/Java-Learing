class Example{
    public static void main(String[] args){
        String Alpahabet = "Abhinav";
        String Alpahabet1 = "Abhinav";
        System.out.println("if 2 Strings are same - "+ Alpahabet.compareTo(Alpahabet1));
        System.out.println();
        /*   A = A 
             b = b
             h = h
             i = i 
         */

        String str = "Abhi";
        System.out.println("Abhi And Abhinav " + Alpahabet.compareTo(str));
        System.out.println();
        /* Every letter is equal but half so it takes the String length  
            A = A
            b = b
            h = h 
            i = i 
            n = ....
            here the Java does this length of Strings if 1st they are equal
            Abhinav = 7 
            Abhi = 4 
            7 - 4 = 3
         */

        String str1 = "abhinav";
        System.out.println("Abhinav and abhinav - "+ Alpahabet.compareTo(str1));
        /*
        A  != a 
        A Ascii value is 65 
        a Ascii value is 97
            65 - 97 = -32 
         */

        String str2 = "Banana";
        System.out.println("Abhinav and Banana "+ Alpahabet.compareTo(str2));
        /*
        A != B 
        B come after A 
        so B = 66
           A = 65
           65 - 66 = -1 
         */
        
           String str3 = "Abhinay";
           System.out.println("Abhinav And Abhinay : "+Alpahabet.compareTo(str3) );
           /* 
           here every Alphabet is same but except v and y 

            */

    }
}