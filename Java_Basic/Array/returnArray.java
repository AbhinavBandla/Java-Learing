class returning{
    static int[] returnFromMethod(){
        int[] arr = {10,20,30,50};

        return arr;
    } 

    static int[] createArray(){
        int[] arr = {10,20,30,40,50};

        return arr;
    }

    public static void main(String[]  args){

        int[] arrayCreate = createArray();

        for(int x : arrayCreate){
            System.out.print(x+" ");
        }
        System.out.println();


        int[] create = returnFromMethod();
        for(int x : create){
            System.out.print(x+" ");
        }
        System.out.println();
        create[0] =  100;
          for(int x : create){
            System.out.print(x+" ");
        }

    }
}