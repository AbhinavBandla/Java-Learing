/*
        ******   FINAL KEYWORD   *******

    Simple definition:

    A final variable is a variable whose value cannot be changed after it is assigned once.

    assign once ✅
    change later ❌  
     final int a = 10;  ->  Then:  -> a = 20;
    ❌ Error

    final → makes it constant
    int → data type
    AGE → variable name
    20 → value

        ******        final makes a variable behave like a constant.

   ******    Why Java gives this feature   *******

Because some values should stay fixed, like:

PI value
max age limit
tax percentage (in a small example)
app name
company code
password length rule

These values are not supposed to be changed accidentally.



**********      Standard Naming Convention for Constants    ************

                Constants are usually written in:

                UPPER_CASE

                If there are multiple words:

                Use underscores _ between words    ---->>>>    ex ---  final int MAX_AGE = 60;


     Java rule:
    Java only checks if the name is valid.

    Convention:

    Developers expect constants to be written as:

    UPPER_CASE

*/

class Main{
    public static void main(String[] args){
        final int a = 10 ;
        int b =20;
        System.out.println(a);
        System.out.println(b);
        // trying to chage value for the var 

        //a = 20;
        b = 24;
        //System.out.println(a);
        System.out.println("After changing the value  'b' 20 -> " +b);


    }
}