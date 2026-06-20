class Pattern1{
    public static void main(String[] args){
        for(int i =4 ; i>= 1 ; i--){//Outer
            for(int j = i; j>=1 ;j--){//Inner
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
    4321
    321
    21
    1

 */