class merging{
    public static void main(String[] args){
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};
        int[] merge = new int[a.length + b.length];

        int index = 0;
        for(int x : a){
            if(index % 2 == 0){
                merge[index] = x;
            }
            index++;
        }
        for(int y : b){
            if(index % 2 == 0){
                merge[index] = y;
            }
            index++;
        }
        index = 0;
        for(int z : merge){
            if(index % 2 == 0){
            System.out.print(z+" ");
        }index++;
        cd
    }

        
        
        //  ***** CAASUAL MERGING  ******
        /* 
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] merge = new int[a.length+b.length];

        int index = 0;
        for(int x : a){
            merge[index] = x;
            index++;
        }
        for(int y : b){
            merge[index] = y;
            index++;
        }
        System.out.println("The Merged array is ");
        for(int z : merge){
            System.out.print(z+" ");
        }
        */
    }
}