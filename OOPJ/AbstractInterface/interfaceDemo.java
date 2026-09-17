/*
InterFace :
        interface is class Where to us it the class should ijmplement the setof rules that provide 
        by the interface class

        Syntax : interface InterfaceName{
                     //body 
                     ** here the Method should Decleared but cannot be Implemented      
                            }
                Child - 
                class ChildClassName implements InterfaceName 
                Note - when class Uses the implements key it agrees with interface Contract's

        To IMplement the interface class as Public the Flie sholud be same as class name 

        Abstract → Implement class MUST implement
Default  → Implement class inherits it → can call through object
Static   → Belongs to interface → call using InterfaceName
                                       
            
*/
interface Vehical{
    void start();
}
class Car implements Vehical {
   public void start(){
        System.out.println("Car Starts");
    }
}
//2
interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("UPI Payment");
    }
}
interface Animal {
    void eat();
    void makeSound();

    default void Breed(){
        //System.out.println("Labrador");
    }
}
//3
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog 'Eats'");
    }
    public void makeSound(){
        System.out.println("Dog 'Barks'");
    }
    @Override
    public void Breed(){
        System.out.println("PetBull");
    }
}
class InterFaceDemo{
    public static void main(String[] argds){
        //3
        Dog d1 = new Dog();
        d1.eat();
        d1.makeSound();
        d1.Breed();

        System.out.println();

        System.out.println("**  With Refernce type **");
        Animal a = new Dog();
        a.eat();
        a.makeSound();
        a.Breed();

        System.out.println();
        //1
        Car c1 = new Car();
        c1.start();
        //2 
        UPI  u1 = new UPI();
        u1.pay();
        

    }
}