/*
Interface variables - 
are the Variables that Declear Inside the INTERFACE  Treated as the Constants
* Which means variables cannot Be Changed after Assigned 
* A class that implements an interface can access the interface variable,
   but it cannot change it.

Syntax - 
interface interface_name{
    data_type Variable_name = values;
}

java Understand that Variable aas (public static final int MAX_SPEED = 120;)
if you want to access this you need to access it by using Inter_face name because it is STATIC

ex - 
interface Vehicle {

    int MAX_SPEED = 120;
}
    System.out.println(Vehicle.MAX_SPEED);

Note - for the Variable Java Gives the 3 Modifiers 1. Public 2.static 3.final 
        ** final means you cannot reassign it
        ** And static means you access it through the interface: Vehicle.MAX_SPEED; 
*/
interface Vehical {
    int MAX_SPEED = 180;
}
class Car implements Vehical{
    void displaySpeed (){
        System.out.println(MAX_SPEED);
    }
}
class InterfaceVar{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.displaySpeed();
        System.out.println(c1.MAX_SPEED);
        System.out.println(Vehical.MAX_SPEED);
    }
}