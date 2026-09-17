/*
1. Class Extends class
2. Class implements class
3. interface extends interface 
4. interface extends class 

Interface → can extend multiple interfaces:
interface Duck extends Animal, Flyable, Swimmable

Class → can implement multiple interfaces:
class RealDuck implements Animal, Flyable, Swimmable

*/
class Device{
    void powerOn(){
        System.out.println("Device is powered ON ");
    }
}
interface Camera{
    void takePhoto();
}
interface GPS{
    void getLocation();
}
//Class Inheritance + Multiple Interface Implementation
class SmartPhone extends Device implements Camera, GPS{
    public void takePhoto(){
        System.out.println("we can Take Photos Init ");
    }
    public void getLocation(){
        System.out.println("We can access the Location inthis");
    }
}
//2 
interface Animal{
    void eat();
}
interface Dog extends Animal{
    void bark();
}
class Labrador implements Dog{
    public void bark(){
        System.out.println("Labrador 'Barks' Louder");
    }
    public void eat(){
        System.out.println("Dog Eats Meast");
    }
}
//3
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}
class Printer implements Printable, Scannable{
    public void print(){
        System.out.println("Printing.....!");
    }
    public void scan(){
        System.out.println("Scanning...!");
    }
}
class MultiLevelFaces{
    public static void main(String[] args){
        //3
        Printer p1 = new Printer();
        p1.print();
        p1.scan();
        //2
        System.out.println();
        Labrador l1 = new Labrador();
        l1.eat();
        l1.bark();

        //1
        System.out.println();
        SmartPhone s1 = new SmartPhone();

        s1.powerOn();
        s1.takePhoto();
        s1.getLocation();



    }
}