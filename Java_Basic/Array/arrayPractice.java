import java.util.Scanner;
class sumAvg {
    public static void main (String[] args){
        Scanner sc  = new Scanner(System.in);

        int[] space = new int[8];

             for(int i =0; i < space.length; i++){
            System.out.print("Enter the Value "+(i+1)+": ");
            space[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i < space.length;i++){
            if(space[i] % 2 == 0 ){
                sum += space[i];
            }
            else{
                count++;
            }
        }
        System.out.println("The of Even values In array  : "+sum);
        System.out.println("The Count of ODD values in array : "+count);

        /*
         
                //   Element Searching  
        int[] search = new int[7];
        int count = 0;
        boolean isPresent = false;

        for(int i =0; i < search.length; i++){
            System.out.print("Enter the Value "+(i+1)+": ");
            search[i] = sc.nextInt();
        }
        System.out.print("Enter target Value : ");
        int target = sc.nextInt();

        for(int i = 0;i < search.length; i++ ){
            if(search[i] == target){
                isPresent = true;
                System.out.printf("The Target %d is Found at Index %d\n",target,i);
                count ++;
            }
        }
        if(isPresent == true){
        System.out.println("The Target values appear "+count+" in Array");
        }else{
            System.out.println("The Values is not Found In Array");
        }
        */



        /* 

                        //MAXIMUM AND MINIMUM 
        int[] values = new int[6];

        for(int i = 0; i < values.length;i++){
            System.out.print("Enter the Value "+(i+1)+": ");
            values[i] = sc.nextInt();
        }
        int max = values[0];
        int min = values[0];

        for(int i = 1; i < values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
            if(min > values[i]){
                min = values[i];
            }

        }System.out.println("Mini Value is : "+min);
        System.out.println("Max values is : "+max);

        */
         
        //  SUM    &&&    AVERAGE   
        /* 
        int[] marks = new int[5];
        int sum = 0;
        double Avg;

        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter Student Marks in Subject "+(i+1)+": ");
            marks[i] = sc.nextInt();
        }

        for(int i = 0; i < marks.length; i++){
            sum+= marks[i];
        }
        System.out.println("Sum of the MArks : "+sum);
        Avg =(double) sum/marks.length;
        System.out.println("Avg is "+Avg);
        */



    }
}
/*
MANUAL tyupe casting 
int myInt = 30;
double myDouble = (double) myInt;

*/