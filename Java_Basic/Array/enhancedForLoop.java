class enhancedLoop{
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};

        // Traditional way to Print the Elements 
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); 
        }

        for(int values : numbers){
            System.out.println(values);
        }


    }
}
  //   *********  Enhanced For Loop   *********
        /* Syntax 
            for (Datatype varName : arrayName){    
            
            ## I will do the Exact same work as the traditional Loop 
            
            System.out.println(varName);
            }

         */