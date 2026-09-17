abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog 'Barks'");
    }
}
//2 
abstract class Payment{
    abstract void pay();
}
abstract class UPI extends Payment{

}
class PhonePe extends UPI{
    void pay(){
        System.out.println("Payment Methods is PhonePe");
    }
}
//3
/* abstract class Employee{
    abstract void work();
} 
abstract class Developer extends Employee{
}
class JavaDeveloper extends Employee{
    void work(){
        System.out.println("The java Developer is Working ");
    }
} */
//4
abstract class Employee {
    abstract void work();
}

class Developer extends Employee {
    void work(){
        System.out.println("Developer Writes the Code");
    }
}

class Tester extends Employee {
    void work(){
        System.out.println("Tester tests the Software");
    }
}
class AbstractDemo{
    public static void main(String argd[]){
        Animal a = new Dog();
        a.makeSound();
        System.out.println();
        //2
        Payment p = new PhonePe();
        p.pay();
        System.out.println();

        //3
      /*   JavaDeveloper jb = new JavaDeveloper();
        jb.work();
        System.out.println(); */
        
        //4
        Employee e1 = new Developer();
        e1.work();
        Employee e2 = new Tester();
        e2.work();

    }
}