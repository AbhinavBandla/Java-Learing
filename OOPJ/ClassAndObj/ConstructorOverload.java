// Constructor Overloading means having multiple constructors in the same class with different parameter lists.

//  Java decides which constructor to execute based on the arguments passed during object creation.


class constructorOverLoad {
    public static void main (String[] args){

        bike b1 = new bike();
        bike b2 = new bike("ntorq 150Xp");
        bike b3 = new bike("ntorq Xp 125", "Tvs");
        bike b4 = new bike();

        b4.brand = "Honda";
        b4.modelName = "City";

        System.out.println(b4.brand + " " + b4.modelName); 

    }
}
class bike {
    String brand ;
    String modelName;
    
    bike(){
        System.out.println("No Argument Constructor ");
    }
    bike(String name, String brand){
        modelName = name ;
        this.brand = brand; 
        System.out.println("2 parameters  Constructor");
        System.out.println(name +" "+brand);
    }


    bike(String name){
        brand = name;
        System.out.println("Parameterised constructor");
    }
}