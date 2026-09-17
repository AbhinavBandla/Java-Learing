/*
Method overriding happens when a child class provides its own implementation of a 
method that it inherited from its parent class.

Same MethodName + Same Parameter = Method @Override .
                + Differ paremeter = method overLoading.

Same method name → display ✅
Same parameter list → (int x) ✅
Child extends Parent → Child extends Parent ✅
*/
class Animal{
    String type;
    String colour;

    void sound(){
        System.out.println("Animal's makes Sounds");
    }
}
// using The @Override command
class Dog extends Animal{
    String Breed;

    @Override
    void sound(){
        System.out.println("Dog is Barking");
    }
}
// without @override Command 
class Cat extends Animal{
    // here the Method names are diifferent in parent class and chuld class.
    // what happen here Java make it as it's own Method not OverRiding Method
    void Sound(){
        System.out.println("Cat make 'Meow' Sound " );
    }
}
/*
@Override does NOT create overriding. -> It confirms/checks that you are overriding.

With the both are Conssidered as the Method overriding 
but..!
the difference is 
Without @Override → Still overriding ✅
With @Override    → Still overriding + compiler checks it ✅
*/

// example here with overriding i make a mistake in method 

class Monkey extends Animal{
     // here i deliberately introduced a mistake s -> S
     @Override
     //void Sound(){
     void sound(){
         System.out.println("MOnkey is 'Quaking'");
     }
} 


class MethodRiding{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.Sound();
    }
}