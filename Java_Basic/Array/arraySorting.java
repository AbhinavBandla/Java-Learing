class Sort {
    public static void main(String args[]){
        // ODD index ascending 
        int[] odas = {5,8,1,6,2,9};

        for(int i = 0; i < odas.length; i++){
            for(int j = i+1; j < odas.length; j++){
                if( i % 2 != 0 && j % 2 != 0){
                    if(odas[i] > odas[j]){
                        int temp = odas[i];
                        odas[i] = odas[j];
                        odas[j] = temp;
                    }
                }
            }
        }
        for(int order : odas){
            System.out.print(order + " ");
        }

        /* 
        //  **** EVEN index Decending 
        int[] evdec = {4,9,2,8,1,7};

        for(int i = 0; i < evdec.length; i++){
            for(int j = i+1; j < evdec.length; j++){
                if( i % 2 == 0 && j % 2 == 0){
                    if(evdec[i] < evdec[j]){
                        int temp = evdec[i];
                        evdec[i] = evdec[j];
                        evdec[j] = temp;
                    }
                }
            }
        }
        for(int order : evdec){
            System.out.print(order + " ");
        }

        */

        /* 
        // decending order only for odd Index 
        int[] oddec = {7,2,9,1,5};

        for(int i = 0; i < oddec.length; i++){
            for(int j = i+1; j < oddec.length; j++){
                if( i % 2 != 0 && j % 2 != 0){
                    if(oddec[i] < oddec[j]){
                        int temp = oddec[i];
                        oddec[i] = oddec[j];
                        oddec[j] = temp;
                    }
                }
            }
        }
        for(int order : oddec){
            System.out.print(order + " ");
        }
        */


        /* 
        //   *** Ascending only the Even-indexes  ***
        int[] evas = {8,3,6,1,9,2};

        for(int i = 0; i < evas.length; i++){
            for(int j = i+1; j < evas.length; j++){
                if( i % 2 == 0 && j % 2 == 0){
                    if(evas[i] > evas[j]){
                        int temp = evas[i];
                        evas[i] = evas[j];
                        evas[j] = temp;
                    }
                }
            }
        }
        for(int order : evas){
            System.out.print(order + " ");
        }
        */


        /* 
        //Decending order sort 
        int[] decend = {90,10,70,30,50};

        for(int i = 0; i < decend.length; i++){
            for(int j = i+1; j < decend.length; j++){

                if(decend[i] < decend[j]){
                    int temp = decend[i];
                    decend[i] = decend[j];
                    decend[j] = temp;
                    
                }
            }
        }
         for(int order : decend){
                System.out.print(order+" ");
            }

        */

        /* 
        //  ****  ASCENDING order sort   ****  
        int[] ascend = {40,10,20,30};

        for(int i = 0; i < ascend.length; i++){
            for(int j = i+1; j < ascend.length; j++){

                if(ascend[i] > ascend[j]){
                    int temp = ascend[i];
                    ascend[i] = ascend[j];
                    ascend[j] = temp ;
                }
            }
        }
        for(int order : ascend ){
            System.out.print(order + " ");
        }

        */
    }
}