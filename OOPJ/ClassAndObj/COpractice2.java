class COpractice2{
    public static void main(String[] args){
        VehicalRegistration v1 = new VehicalRegistration("Abhinav");
        System.out.println();
        VehicalRegistration v2 = new VehicalRegistration("Abhinav", "Skoada Car");
        System.out.println();
        VehicalRegistration v3 = new VehicalRegistration("Abhinav", "Defender car","AP40RM2312");
    }
}
class VehicalRegistration{
    String name;
    String VehicalType  ;
    String Registration ;

    VehicalRegistration(String name){
        this(name, "Not Assigned" , "Not Assigned");
    }
    VehicalRegistration(String name, String VehicalType){
        this(name, VehicalType, "Not Assigned");
    }
    VehicalRegistration(String name, String VehicalType, String Registration ){
        this.name = name;
        this.VehicalType = VehicalType;
        this.Registration = Registration;

        System.out.println("Name : "+name +"\nVehicalType : "+VehicalType+ "\nRegistration : "+Registration);
    }
}