/*
    ACCESSING PARENT MEMBERS 
    - When a class extends another class, the child can access the accessible members of the parent.

    Protected Memebrs - 
        protected is an access modifier that allows a member to be accessed:

    Inside the same class
    By classes in the same package
    By child classes in other packages

    For our current inheritance focus, remember:

    protected allows the child class to access the parent's member.

*/
// Pratice 

class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name : "+name+"\n"+"Age : "+age);
    }
}
class Student extends Person{
    int stuId;

    void displayStudent(){
        System.out.println("Student Id : "+stuId);
    }
}

// 2 
class Employee {
    String name;
    int salary;

    String work(){
        return "Emplyee is Working";
    }

    void displayEmployee(){
        System.out.println("Name : "+name+"\n"+"salary : "+salary);
    }
}
class Developer extends Employee{
    String language;

    @Override
    void displayEmployee(){
        super.displayEmployee();
        System.out.println("Language : "+language);
    }
    @Override
    String work(){
        System.out.println(super.work());
        return "Developer is Coding";
    }

    // to Get Inorder return stateMent
  /*   @Override
    String work(){
        String parentWork = super.work();
        System.out.println("Developer is coding");
        return parentWork;
    } */
}

class InheritancePractice{
    public static void main(String[] args){

        //1 
        Student s1 = new Student();

        s1.name = "Abhinav";
        s1.age = 20;
        s1.stuId = 101;

        s1.displayPerson();
        s1.displayStudent();
        System.out.println();
        
        //2 
        Developer d1 = new Developer();
        d1.name = "Abhinav";
        d1.salary = 300000;
        d1.language = "Java";


        d1.displayEmployee();
        System.out.println();
        System.out.println(d1.work());
    }
}