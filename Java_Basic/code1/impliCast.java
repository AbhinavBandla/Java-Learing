class Wide{
    public static void main(String[] args){
        //explicit casting (Widening) - converting small to big 
        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println("price : "+price);
        System.out.println("wholePrice : "+wholePrice);
        System.out.println();

        //implicit casting(widening) - without sufix
        //   *** 1 ***

        int num = 100;
        long bigNum = num;

        System.out.println("NUM : "+num);
        System.out.println("bigNum : "+bigNum);
        System.out.println();
        //  *** 2 ***
        int marks = 85 ;
        double average = marks;

        System.out.println("mraks : "+marks);
        System.out.println("average : "+average);
        System.out.println();

        //  *** 3 *** with sufix 
        float temprature = 36.5F;
        double tempDouble = temprature;

        System.out.println("temp : "+temprature);
        System.out.println("tempDouble : "+tempDouble);
        System.out.println();

        //  *** 4 *** with sufix
        long population = 5000L;
        float populationFloat = population;

        System.out.println("population : "+population);
        System.out.println("populationFloat : "+populationFloat);
        System.out.println();
    }
}