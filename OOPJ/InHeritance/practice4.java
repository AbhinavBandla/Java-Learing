class Vehical{
    String brand;
    int speed;

    Vehical(String brand , int speed){
        this.brand = brand;
        this.speed = speed;

        System.out.println("Vehical COnstructor");
    }
    void drive(){
        System.out.println("Vehical is Driving");
    }
    void details(){
        System.out.println("Brand : "+brand+"\n"+"Speed : "+speed);
    }
}
class Car extends Vehical{
    String model;

    Car(String brand, int speed, String model){
        super(brand, speed);
        this.model = model;
        System.out.println("Car constructor");
    }

    @Override
    void drive(){
        super.drive();
        System.out.println("Car is Driving");
    }

    @Override
    void details(){
        super.details();
        System.out.println("Model : "+model);
    }
}
class SportsCar extends Car{
    boolean turbo;

    SportsCar(String brand, int speed, String model, boolean turbo){
        super(brand, speed, model);
        this.turbo = turbo;
        System.out.println("sportsCar constructor");
    }

    @Override
    void drive(){
        super.drive();
        System.out.println("SportsCar is Racing");
    }

     @Override
    void details(){
        super.details();
        System.out.println("is TurboCharged : "+turbo);
    }
}
class InheritancePractice3 {
    public static void main(String[] args){
        SportsCar s1 = new SportsCar("Ford", 440,"Mustang", true);

        s1.drive();
        System.out.println();
        s1.details();
    }
}