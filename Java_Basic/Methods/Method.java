import java.util.Scanner;

class exampleMethod{
    // Normal Method void - static - no object is required 
    // void -  no need to return 
    static void greeting(){
        System.out.println("Wellcome Man..!!");
    }
    static void greething(String name){
        System.out.println("Wellcome to java Dude " + name);
    }
    // Method with Return type 
    static String greet(String name){
        return "Wellcome " + name;
    }

    static int check(int a){
        if (a>=18){
            //System.out.println("OK");
            return 1;
        }else {
            return 0;
        }
    }
    static boolean isEven(int a ){
       return a %2 == 0;
    }
    static String Wellcome(String name, String name2){
        return String.format("Wellcome Mr.%s and Mrs.%s",name , name2);
    } 

    // Method With condition 
    static void askForNum(int a ){
        Scanner scanner = new Scanner(System.in);
        while(a !=0 ){
            System.out.print("Enter Number : ");
            a = scanner.nextInt();
        }System.out.println("Loop is Executed ");
    }
    
    public static void main(String[] args){
      //  greeting();
       // System.out.println(greet("Abhi"));
       // System.out.println(check(34));
      //System.out.println( Wellcome("Abhinav" , "Supreeethi"));
      //greething("Abhi");
        System.out.println(isEven(4));
       // askForNum(4);


    }

}