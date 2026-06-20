class EnhancedLoopPractice{
    public static void main(String[] args){

        int[] values = {10, 20, 30, 40, 50};
        int sum = 0 , count = 0;

        for(int num : values){
            if(num > 25){
                sum += num;
                count++;
            }
        }
        System.out.printf(" The Sum of Elemnets Greater Than 25 in Array is  %d \n Count of elements Greater than 25 is %d",sum,count);



        /* 
        //    ********* max AND   min   **********
        int[] num = {12, 45, 67, 22, 90};
        int max = num[0];
        int min = num[0];

        for(int values : num){
            if(values > max ){
                max = values;
            }
            else if(values < min){
                min = values;
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

        */ 
       /* 

        //     **********     SUM   *********
        int[] number = {10, 20, 30, 40};
        int sum = 0;

        for(int num : number){
            sum += num;
        }
        System.out.println("The Sum of Array elements is "+sum );

        */
    }
}