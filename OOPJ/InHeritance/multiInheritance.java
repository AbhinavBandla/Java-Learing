/* 
Multi-Inheritance is Not Support For Classes 
why because java Get confused which From which parent should if Use 

 */
class ParentA{
    void Display(){
        System.out.println("from Parent A");
    }
}
class ParentB{
    void Display(){
        System.out.pritnln("From Parent B ");
    }
}
class child extends ParentA,ParentB{

}
class Main{
    public static void main(String[] args){
        Child c1 = new Child();

        c1.Display();
    }
}