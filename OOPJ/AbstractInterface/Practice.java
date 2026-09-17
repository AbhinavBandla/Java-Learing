abstract class Employee{
    String name;
    void login(){
        System.out.println("Employee Logged IN");
    }
    abstract void work();
    Employee(String name){
        this.name = name;
    }
}
class Developer extends Employee{
    void work(){
        System.out.println("Developer Writes Code");
    }
    Developer(String name){
        super(name);
    }
    void displayName(){
        System.out.println("Employee Name : "+name);
    }
}
//2
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println("Bird Is Eating");
    }
    abstract void makeSound();
}
interface Flyable{
    void fly();
}
class Bird extends Animal implements Flyable{
    void makeSound(){
        System.out.println("Bird is Chirping");
    }
    public void fly(){
        System.out.println("Bird is Flying");
    }
    Bird(String name){
        super(name);
    }
    void nameDisplay(){
        System.out.println("Brid Name : "+name);
    }
}
//3 
abstract class Employ{
    String name;
    Employ(String name){
        this.name = name;
    }
    void login(){
        System.out.println("Employee Is LoggedIN");
    }
    abstract void work();
}
interface Programmable{
    void code();
}
interface RemoteWork{
    void workFromHome();
}
class Developerr extends Employ implements Programmable, RemoteWork{
    Developerr(String name){
        super(name);
    }
    void work(){
        System.out.println("Developer Is Working");
    }
    public void code(){
        System.out.println("Developer is Coding");
    }
    public void workFromHome(){
        System.out.println("Developer is Working From Home");
    }
}
class AbstractInterface{
    public static void main(String argd[]){
        //3
        Developerr D = new Developerr("Rahul");
        System.out.println(D.name);
        D.login();
        D.work();
        D.code();
        D.workFromHome();

        System.out.println();
        //2
        Bird b1 = new Bird("someHow");
        b1.nameDisplay();
        b1.makeSound();
        b1.fly();

        
        System.out.println();
        //1
        Developer d1 = new Developer("Abhinav");
        d1.displayName();
        d1.login();
        d1.work();

    }
}