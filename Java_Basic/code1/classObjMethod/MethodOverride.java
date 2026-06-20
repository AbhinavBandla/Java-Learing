//      **********  METHOD overRiding   *********
/* 
When the child class creates a method with the same name, same parameters,
 and same return type as the parent class method, it is called:  Method Overriding.

Parent already has a method.

Child says:

“I want my own version of that same method.”

That is overriding.


For overriding:

method name must be same ✅

parameters must be same ✅                //  ****   Same method in child = overriding

return type must be same ✅


*******    Method overriding means child class changes the behavior of a parent method 
            by writing the same method again in the child class.



*/

class overR{
    public static void main (String[] args){
        Dog d1 = new Dog("Puppy","Brown",1.5,"labour");
        
        System.out.println(d1.showDetails());
    }
}
class Animal {
    String name;
    String colour;
    double age;
    
    Animal(String name,String colour,double age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    
    String showDetails(){
        return name + " " + colour + " " + age;
    }
}
class Dog extends Animal{
    String breed;
    
    Dog(String name, String colour,double age,String breed){
        super(name,colour,age);
        this.breed = breed;
    }
    
    @Override
    String showDetails(){
         return name + " " + colour + " " + age+ " "+ breed; 
    }
}
