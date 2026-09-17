/*
Multiple child classes inherit from the same parent class.
*/
class Employee{
    String name;
    int salary;

    void work(){
        System.out.println("Employee Is working");
    }
}
class Developer extends Employee{
    String language;

    void code(){
        System.out.println("Developer is Coding");
    }
}
class Tester extends Employee{
    String tool;

    void test(){
        System.out.println("Tester is Testing");
    }
}
class DemoHierarchial{
    public static void main(String[] args){
        Developer d1 = new Developer();
        d1.name = "Rahul";
        d1.salary = 3500000;
        d1.language = "Java";
        d1.work();
        d1.code();

        System.out.println();
        Tester t1 = new Tester();
        t1.name = "Abhinav";
        t1.salary = 300000;
        t1.tool = "n/a";
        t1.work();
        t1.test();
    }
}