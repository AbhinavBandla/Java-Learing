class Cast{
    /*
    Java changes one data type to another automatically when it is safe. is called Convertion.

    1) TYPE CONVERSION
    - Automatic conversion done by Java
    - Happens when smaller type goes to bigger type
    - Safe conversion (usually no data loss)

    We manually change one data type to another using brackets when Java does not do it automatically. is called Casting.

    2) TYPE CASTING
    - Manual conversion done by programmer
    - We use brackets before the value/variable
    - Usually used when bigger type goes to smaller type
    - May cause data loss
    */
    public static void main(String[] args){
        // convertion 
        // syntax 
        /* smallData_type var1 = literal;
        targetData_type var2 = var1;
         */
        int marks = 85;
        double average = marks;
        System.out.println("marks : "+marks);
        System.out.println("Average : " +average);

        System.out.println();
        //casting 
        /* Syntax 
        data_type var1 = value;
        tragetdata_type var2 = (tragetdata_type) var1; 
        */

        double price = 99.99;
        int wholePrice = (int) price;
        
        System.out.println("price : "+price);
        System.out.println("wholePrice : " + wholePrice);

        System.out.println();
        //casting 
        long salary = 50000L;
        int salaryInt = (int) salary;

        System.out.println("salary : "+ salary);
        System.out.println("salaryInt : " + salaryInt);

        System.out.println();
        //casting 
        long bigNum = 3000000000L;
        int smallNum = (int) bigNum;

        System.out.println("bigNum : "+bigNum);
        System.out.println("smallNum : " + smallNum);

        System.out.println();

        long safeNum = 200L;
        int safeInt = (int) safeNum;

        System.out.println("safeNum : "+safeNum);
        System.out.println("safeInt : " + safeInt);

        System.out.println();

        double discount = 45.89;
        int wholeDiscount = (int) discount;

        System.out.println("discount : "+discount);
        System.out.println("wholeDiscount : " + wholeDiscount);

        System.out.println();
        // converstion  **36.5 (without F) is treated by Java as double
        float temperature = 36.5F;
        double tempDouble = temperature;

        System.out.println("temperature : "+ temperature);
        System.out.println("tempDouble : " + tempDouble);

         System.out.println();

        float num = 10.5F;
        float num1 = (float) num;
        System.out.println(num);
        System.out.println(num1);

        // *********
        //Type Conversion = Implicit Casting = Widening
        //Type Casting = Explicit Casting = Narrowing



        //    *************   Another TOPIC   **************
        //     &&&&&&&&&&&    Precision Loss  &&&&&&&&&&&&&& 
        
        /*
            Precision Loss = decimal part gets lost OR exact value changes

            ex --

            double price = 99.99;
            int whole = (int) price;

            System.out.println(price);
            System.out.println(whole);

            op - 
            99.99
            99

            -->> .99 LOSS
        */
    }
}
/*
short a = 10;
int b = a;

source = short
destination = int

short → int

Smaller → Bigger

✅ Use:

Type Conversion



long a = 100L;
int b = (int) a;

source = long
destination = int

long → int

Bigger → Smaller

⚠️ Use:

Type Casting
*/