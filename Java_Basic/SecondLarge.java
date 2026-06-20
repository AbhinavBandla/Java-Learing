import java.util.Scanner;
class secondLarge{
    public static void main(String[] args){

        int[] dupli = {100,100,90,80};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int arr : dupli){
            if(arr > largest ){
                second = largest;
                largest = arr;
            }else if(arr > second && arr != largest ){
                second = arr;
            }
        }
         System.out.println("Largest : "+largest);
          System.out.print("second : "+second);

        /* 
        // Largest and second largest With terditional for LOop 
        int[] large = {90,40,70,120,110};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i =0; i < large.length; i++){

            if(large[i] > largest){

                second = largest;
                largest = large[i];
            }
            else if(large[i] > second && large[i] != largest){
                second = large[i];
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Second : "+second);

        */

        /* 
        //   ******  Finding THE LARGEST AND SECOND Largest  ******
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Array Length : ");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i <arr.length; i++){
            System.out.printf("Enter the element at %d index : ",i);
            int x = scanner.nextInt();
            arr[i] = x;
            
        }
        for(int val : arr){
            System.out.print(val+ " ");
        }
        System.out.println();
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int val : arr){
            if(val > largest){
                second = largest;
                largest = val;
            }
            else if(val > second && val != largest){
            second = val ;
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Second : "+second);



        scanner.close();
        */
    }
}