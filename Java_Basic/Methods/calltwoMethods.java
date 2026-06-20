class callTwoMethods
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

    public static void main(String[] args)
    {
        test(2);
    }
}