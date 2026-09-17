class Person {
    String name;
    int age;

    Person(String Name){
        this.name = Name;
        System.out.println("From Parent Person  -  "+Name );
    }
}
class Employee extends Person {
    String company;

    Employee(String Company){
        super("Abhinav");
        this.company = Company;
        System.out.println("From child Employee  -  "+ company );
    }
}
class Developer extends Employee{
    String language;

    Developer(){
        super("Acer");
        System.out.println("From Child 2 Developer");
    }
}

class ConChainning{
    public static void main (String[] args){
        Developer d1 = new Developer();
    }
}