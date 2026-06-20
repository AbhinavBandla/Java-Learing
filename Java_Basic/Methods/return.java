class returnType{
    static int multiply(int a, int b){
        return a*b ;
    }
    static String getCity(String name){
        return name;
    }

    static boolean isEven(int num){
        if (num % 2 ==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){

        System.out.println(isEven(5));

       // int result = multiply(2,3);
        //System.out.println(result);

       // String cityName = getCity("NewYork");
       // System.out.println(cityName);
    }
}