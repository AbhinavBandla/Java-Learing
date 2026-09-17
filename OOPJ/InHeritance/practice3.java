class Person{
    String name;

    Person(String name){
        this.name = name;
        System.out.println("Parent Constructor");
    }

    String work(){
        return "Person is Working";
    }
}
class Employee extends Person{
    String company;

    Employee(String name,String company){
        super(name);
        this.company = company;
        System.out.println("Employee Constructor ");
    }

    @Override
    String work(){
        System.out.println(super.work());
        return "Employee is Working in "+ company;
    }
    }

class Developer extends Employee{
    String language;

    Developer(String name, String company, String language){
        super(name, company);
        this.language = language;
        System.out.println("Developer Constructor");
    }

    @Override
    String work(){
       System.out.println(super.work());
       return "Developer is Coding with "+language;
    }
} 
class InheritancePractice {
    public static void main (String[] args){
        Developer d1 = new Developer("Abhinav","StrakIndustries","Java");

        System.out.println(d1.work());
    }
}