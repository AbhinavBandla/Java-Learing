/*
Default methods were mainly introduced so interfaces could gain 
new behavior without forcing all existing implementing classes to implement the new method.

defaultMethod - means the mehto d which have the Body (Implementation)
in Default method - 

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override 
    public void show(){
        System.out.println("From Implement class");
    }
}
  **** Here java Het Confused which Method to use show is in B and Also in A.

  for that We have solution -  
                ****   InterfaceName.super.methodName() 

    class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // “Java, go to interface A and use its default show() method.”
        B.super.show(); // “Java, go to interface B and use its default show() method.”  
    }  
*/
interface Animal{
    default void sleep(){
        System.out.println("Animal Is Sleeping");
    }
}
class Dog implements Animal{
    @Override 
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }
}
//2 
interface Camera{
    default void start(){
        System.out.println("Camera Starts");
    }
}
interface GPS {
    default void start(){
        System.out.println("GPS start's");
    }
}
class SmartPhone implements Camera, GPS{
    @Override 
    public void start(){
        GPS.super.start();
    }
}
//3
interface Payment{
    default void pay(){
        System.out.println("Payment processing");
    }
}
interface UPI extends Payment{
    default void pay(){
        System.out.println("UPI payment");
    }
}
class PhonePe implements UPI {
    @Override 
    public void pay(){
        System.out.println("Phonepe Payment");
    }
}
class DefaultMethod{
    public static void main(String[] args){
        //3
        Payment p1 = new PhonePe();
        p1.pay();

        System.out.println();
        //2
        SmartPhone sp1 = new SmartPhone();
        sp1.start();
        
        //1
        System.out.println();
        Dog d1 = new Dog();
        d1.sleep();
    }
}