class Explli{ // Ecplicit casting Narrowing 
    public static void main(String[] args){
        // cobverting long -->> small
        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println("price : "+price);
        System.out.println("wholePrice : "+wholePrice);
        System.out.println();

        long salary = 50000L;
        int salaryInt = (int) salary;

        System.out.println("salary : "+salary);
        System.out.println("salaryInt : "+salaryInt);
        System.out.println();

        long bigNum = 3000000000L;
        int smallNum = (int)bigNum;

        System.out.println("bigNum : "+bigNum);
        System.out.println("smallNum : "+smallNum);
        System.out.println();
        /*
            If you do explicit casting from bigger type 
            to smaller type, and the value is outside smaller type range, the result can become wrong / strange / negative.
         */
    }
}