class Main{
    public static void main(String[] args){
          /* Car - className
            myCar - reference Variable
            new - creates a new Object 
            Car() - constructor call 

            Dot Operator (.)
            The dot operator means:
            Go inside this object and access something.

            Go to myCar object
            Access brand variable
         */
        // Directly class and Object 
        Car myCar = new Car(); // car class Object 
        myCar.Brand = " ToYoTa";
        myCar.year = 2026;

        System.out.println(myCar.Brand +" " + myCar.year + " Model");

        // another class with method 
        Student stu1 = new Student(); // Student class Object 
        stu1.name = "Abhinav";
        stu1.id = 472;
        stu1.displayStudent();

        // Hotel class 
        Hotel h1 = new Hotel();   // hotel Class Object 
        h1.hotelDetails("Akshara","8th Line kapu street Nellore");

    }
}
class Car {
    String Brand ;
    int year;
}
class Hotel{
    String Name; 
    String Address;

    void hotelDetails(String name , String address){
        this.Name = name;
        this.Address = address;
        System.out.println("Hotel name is "+ Name + " Address of the Hotel is "+Address);
    }
}
class Student {
    String name ;
    int id;

    void displayStudent(){
        System.out.println("He is "+ name + " , id Number is " + id);
    }
}