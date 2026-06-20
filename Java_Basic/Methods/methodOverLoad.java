class methodOverload{
    //ex-1
    static void display(int x){
        System.out.println("Integer Method");
    }
    static void display(String msg){
        System.out.println("String Method");
    }
    //         Ex-2

    static void add(int x , int y){
        int a = x+y;
        System.out.printf("SUM %d and %d is %d\n",x,y,a);
    }
    static int add(int a , int b, int c){
        
        System.out.printf("Sum of %d , %d and %d is ",a,b,c);
        return a+b+c;
    }
    //         Ex-3
    static int area(int a){
        System.out.printf("Square of %d is ",a);
        return a*a;
    }
    static int area(int a, int b){
        System.out.printf("Area of rectangle is %d * %d is ",a,b);
        return a*b;
    }
    public static void main(String[] args){
      //  display(23);
      //  display("Hello");
      //  add(2,3);
     //   System.out.println(add(4,5,6));
       System.out.println(area(3));
       System.out.println(area(3, 5));
    }
}