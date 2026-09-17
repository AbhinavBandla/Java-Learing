/*
Inheritance - 
Inheritance is an OOP feature that allows one class to acquire the properties (variables) and 
behaviors (methods) of another class.

Child class inherits from Parent class.

we use this to Avoid the Code-Duplication 
*harder to maintain.
*more bugs.
*more code.
*difficult to update.

*****
Inheritance is one-way(unidirectional). Student inherits from Human, so Student gets the members of Human.
But Human does not inherit anything from Student, so it cannot access Student's id variable.
and 
PRIVATE variable cannot be inherited.

why to use Inheritance 
Inheritance is needed to reuse common code and 
no avoid writing the same code repeatedly when multiple classes share common properties and behaviors.
*/
import java.util.Scanner;
class Human{
    String name;
    int age;
    

    void walk(){
        System.out.println("Human is walking");
    }
    void display(String name){
        this.name = name;
    }
}
class Student extends Human {
    // extends creats the relation , it doesn't copy. 

    int id;
    Student(){
    }
    Student(String name , int age , int id ){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    void displayDetails(){
        System.out.println("Name : "+ name + "\n"+
            "Age : "+age+"\n"+
            "id : "+id
        );
    }
}
class InherDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        
        Student s1 = new Student();
        s1.name = "Abhinav";
        s1.age = 23;
        s1.id = 4721;
        
            System.out.println("Name : "+s1.name+"\n"+"Age : "+s1.age+"\n"+"Id : "+s1.id);
            Student s2 = new Student("Rahul",35,776);
            s2.displayDetails();
        
        Student s3 = new Student("Vasista",8,555);
        s3.walk();
        
    }
}