class Person{
    String name;

    void eat(){
        System.out.println("Person is Eating");
    }
}
class Employee extends Person{
    int salary;
    void work(){
        System.out.println("Employee is Working");
    }
}
class Developer extends Employee{
    String language;

    void code(){
        System.out.println("Developer is Coding");
    }
}
class MultiInheritance{
    public static void main(String[] args){
        Developer d1 = new Developer();

        d1.name = "Abhi";
        d1.salary = 300000;
        d1.language = "Java";

        d1.eat();
        d1.work();
        d1.code();
    }
}