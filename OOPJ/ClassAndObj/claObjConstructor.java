class classDemo{
    public static void main(String[] args){
        // School
        School s1 = new School("Abhi's Freedom Concept School",99999999L,"Nellore");
        s1.Display();

        //person Class 
        person p1 = new person();
        person p2 = new person();

        System.out.println(p1.name);
        p2.name = "Abhinav";

        System.out.println(p2.name);

        // college
        college c1 = new college("Sri chaithanya");
    }
}
class college {
    
    college(String name){
        System.out.println("Name of the College "+name);
    }

}
// no class withConstructor 
class School{
    String name ;
    long Number ;
    String Address;

    School(String Name , long phone , String Address){
        // no-need This KeyWord when the parameter and class variables are different 
        name =  Name;
        Number = phone;
        this.Address = Address;
    }
    void Display (){
        System.out.println(name +" "+Address +" " + Number);
    }
}

class person {
    String name;

    person(){
        name = "Rahul";
       // System.out.println("Constructor Executed ");
    }
}

/*
Constructors are needed to initialize an object when it is created.

Without constructors, objects may start with unwanted default values.
*/