class COpractice1 {
    public static void main(String[] args){
        bank1 b1 = new bank1("Abhinav");
        b1.displayDetail();
        System.out.println();
        bank1 b2 = new bank1("Sailaja", 300000);
        b2.displayDetail();
        



    }
}
/*  // traditional way
class bankAccount{
    String name;
    double Balance;
    String AccountType = "savings";
    
    // case 1 - Account Holder Name
    bankAccount(String name){
        this.name = name;
        System.out.println("Account Holder : "+ name);
        System.out.println("Balance : " +Balance);
        System.out.println("Account Type : "+AccountType);
    }
    bankAccount(String name ,double Balance){
        this.name = name;
        this.Balance = Balance;
        System.out.println("Account Holder Name : "+ name);
        System.out.println("Balance : "+Balance);
        System.out.println("Account Type : " + AccountType);
    }
     bankAccount(String name ,double Balance, String AccountType){
        this.name = name;
        this.Balance = Balance;
        this.AccountType = AccountType;
        System.out.println("Account Holder Name : "+ name);
        System.out.println("Balance : "+Balance);
        System.out.println("Account Type : " + AccountType);
    }
}
    */
   class bank1{
    String name ;
    double Balance;
    String Accounttype = "Savings";

    bank1(String name){
        this(name, 0.0, "Savings");// chain to case 3 Constructor 
    }

    bank1(String name , double Balance){
        this(name , Balance,"Savings"); // chain to case 3 constructor 
    }

    bank1(String name, double Balance , String Accounttype){
        this.name = name;
        this.Balance = Balance;
        this.Accounttype = Accounttype;
    }
    void displayDetail(){
         System.out.println("Account Holder : "+ name);
        System.out.println("Balance : " +Balance);
        System.out.println("Account Type : "+Accounttype);
    }
   }