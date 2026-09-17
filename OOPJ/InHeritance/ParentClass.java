/*
A Parent Class, also called a Superclass, is the class whose members are inherited by another class.
Don't think super = better.
The class higher in the inheritance hierarchy.

 */
class Person{
    String name ;
    int age;
}
class Student extends Person{
    int rollNo ;
}
class Teacher extends Person{
    String subject;
}
class Employee {
    String name;
    int salary;

    void work(){
        System.out.println("Employee is Working");
    }
}
class Developer extends Employee{
    String codeLanguage ; 


    void code(){
        System.out.println("Developer is coding");
    }
}
class DemoInher{
    public static void main(String[] args){
        Developer d1 = new Developer();

        d1.name = "Abhinav";
        d1.salary = 300000;
        d1.codeLanguage = "Java";

        d1.work();
        d1.code();
    }
}