class practiceRecurtion{
    static void countDown (int i ){
        if (i == 0){
            return;
        }
        System.out.println(i);
        countDown(i-1);
    }
    static void count(int x){
        if(x == 6 ){
            return;
        }
        System.out.println(x);
        count(x + 1);
    }
    public static void main(String[] args){
       // countDown(5);
        count(1);
    }
}