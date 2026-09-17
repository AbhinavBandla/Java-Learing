/*
class can Implement the Multiple Interface 
Syntax 
class Class_name implements interFace_name, Interface_name2{}
*/
interface Camera {
    void takePhoto();
}
interface GPS {
    void GetLocation();
}
class SmartPhone implements Camera, GPS{
    public void takePhoto(){
        System.out.println("Wa can Take with this SmartPhone");
    }
    public void GetLocation(){
        System.out.println("we can get The access for the Locations"); 
    }
}
class MultipleInterFaces{
    public static void main(String[] args){
        SmartPhone sm1 = new SmartPhone();
        sm1.takePhoto();
        sm1.GetLocation();
    }
}