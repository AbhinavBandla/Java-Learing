/*     super is a Java keyword used inside a child class to 
    refer to its immediate parent class.

    Syntax - super.variableName
    super = "My immediate parent."

    supper - Call my Immidiate parent 

    parent 
      |
    super.Child   - work's

    parent
      |
    child 
      |
    super.child  - doesn't work
 */
class Person{
    String name = "Person";

    void display(){
        System.out.println("Person is Moving");
    }
}
class Student extends Person{
    String name = "Student";

    @Override
    void display(){
        System.out.println("Student is Studing");

        super.display();
    }


    void show(){
        System.out.println("Student class : "+name);
        System.out.println("Parent class : "+super.name);
    }
}
class SuperDemo{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.show();

        s1.display();
    }
}