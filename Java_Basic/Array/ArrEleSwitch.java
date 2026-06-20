import java.util.Scanner;
class ShiftArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] shiftArr = {10,20,30,40,50};
        
        System.out.print("Enter 1 for Left or 2 For right : ");
        int num = sc.nextInt();
        
        System.out.println();
        switch(num) {
            case 1 :
                int temp = shiftArr[0];
                for(int i = 0; i < shiftArr.length - 1; i++){
                    shiftArr[i] = shiftArr[i + 1];
                }
                shiftArr[shiftArr.length - 1] = temp;

                for(int x : shiftArr){
                    System.out.print(x +" ");
                }
                break;
            case 2 :
                int  tempValue = shiftArr[shiftArr.length - 1];
                for(int i = shiftArr.length-1 ; i > 0; i--){
                    shiftArr[i] = shiftArr[i - 1];
                }
                shiftArr[0] = tempValue;

                for(int x : shiftArr){
                    System.out.print(x +" ");
                }
                break;
            default : 
            System.out.println("Invalid");

        }

    }
}