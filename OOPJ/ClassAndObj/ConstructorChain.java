/*
Constructor Chaining is the process of calling one constructor from another constructor 
 within the same class, or from a different class (like a parent class).
 */
class Main{
    public static void main(String[] args){
        bike b1 = new bike("Ktm", "AP40A2321", 2024);
        System.out.println();
        bikeManuFacturing bike1 = new bikeManuFacturing("Ntorq", "Ntorq1234567");
        
    }
}
// class -2 Example (Bike ManuFacturing)
class bikeManuFacturing{
    String name;
    String number;
    boolean isSaftyInspected;

    bikeManuFacturing(){
        this.isSaftyInspected = true;
        System.out.println("SaftyInspectedChecked.....!!");
    }
    bikeManuFacturing(String name, String num){
        this();
        this.name = name;
        number = num;
        System.out.println("Name "+name+" ChasisNumber "+number);
    }
}

// class 1 - example(bike Details) 
class bike{
    String name ;
    String number;
    int year;
    
    bike(){
        System.out.println("NO parameter's Constructor ");
    }
    bike(String name){
        this.name = name;
        System.out.println("Single Parameter Constructor ");
        System.out.println(name + " - name");

    }
    bike(String name,String number){
        this(name);
        this.number = number;
        System.out.println("Double parameter consatructor");
        System.out.println(number +" - number");
    }
    bike(String name, String number , int year){
        this(name, number);
        this.year = year;
        System.out.println("Triple constructor");
        System.out.println(year + " - Year ");
    }
    
}