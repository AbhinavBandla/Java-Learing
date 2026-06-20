class selfCall
{
    static void test(int n)
    {
        if(n == 0)
        {
            return;
        }

        test(n - 1);

        System.out.println(n);

        test(n - 1);
    }
     
    //factorial 5x4x3x2x1 
    static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        //return n * fact(n - 1);
        return n + fact(n-1);
    }
    // power
    static int power(int base, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args)
    {
        test(2);
        System.out.println(fact(5));
        System.out.println(power(2,4));
    }
    /* 
    Here there is another comcept called   ***** StackOverFlow   ****** 

    where when the method call itself without stopping condition, for every call it consume some amount of memory 
    
    - when the Memory is fill the java through an error ** StackOverFlow  **

    Example - 
                 class Main
{
                    static void test()
                    {
                        System.out.println("Hello");

                        test();
                    }

                    public static void main(String[] args)
                    {
                        test();
                    }
                }
    */
}