class arrayExam2{
    public static void main(String[] args){
        int[] values = new int[5];
        values[0] = 10;
        values[2] = 20;
        values[values.length -1] = 50;
       // System.out.println("Length of an array is "+values.length);
       // System.out.println();

        //       #2 
        /* 
        String[] languages = new String[4];
        languages[1] = "Java";
        languages[languages.length - 1] = "Python";
        //System.out.println("Lemgth of an language array is "+languages.length);
        //languages[1] = "C++";

        for(int i = 0;i< languages.length ;i++){
            System.out.println("At "+i+" index is "+languages[i]);
        }
         
        languages[1] = "c++";
        System.out.println("Updated Index 0 Element is "+languages[1]);
        */
       
        //   #3

        double[] decimal =  new double[5];
        decimal[0] = 10.5;
        decimal[decimal.length/2] = 25.7;
        decimal[decimal.length - 1] = 99.9;
        System.out.println("Length of an Array is " + decimal.length);
        System.out.println();
        


        for(int i = 0;i< decimal.length ;i++){
            System.out.println("At "+i+" index is "+decimal[i]);
        }
         
         
        
    }
}