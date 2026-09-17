class SuperKWConstructor {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        Student s1 = new Student();

        Teacher t1 = new Teacher();

      //  Vehical v1 = new Vehical("TVS");
        //System.out.println(v1.brand); - // if there isno print statement use this 

        Bike b1 = new Bike();
        
    }
}
// pareterized constructor 
class Vehical {
    String brand;
    int year;

    Vehical(String Brand, int year){
        this.brand = Brand;
        this.year = year;
        System.out.println(brand +" \n"+year);
        
    }
}
class Bike extends Vehical{
    int wheels;
// if parent constructor have the parameter
    Bike(){
        super("BMW",2027);
        System.out.println("From Bike");
    }
}

// no- paremeter constructor 
class Human{
    String name;
    int age ;

    Human(){
        System.out.println("From Human");
    }
}
// super must be the 1st statement in child class
class Student extends Human{
    int id;
// writing super kw Explicitly 
    Student(){
        super();
        System.out.println("From Child");
    }
}
class Teacher extends Human{
    int subject;
//If you don't explicitly write super()- 
// - inside a child constructor, Java automatically inserts super() as the first statement.
    Teacher(){
        System.out.println("From tecaher");
    }
}