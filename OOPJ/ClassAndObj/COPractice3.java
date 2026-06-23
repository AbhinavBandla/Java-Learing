class COpractice3{
    public static void main(String[] args){
        LapStore Lap1 = new LapStore("Acer");
        LapStore Lap2 = new LapStore("Acer", "Pradator", 16 );
        LapStore Lap3 = new LapStore("Acer", "Pradator-Helious", 16 , 200000);
        LapStore lap4 = new LapStore("Dell", "Inspiron");

        Lap1.DisplayDetails();
        System.out.println();
        Lap2.DisplayDetails();
        System.out.println();
        Lap3.DisplayDetails();
        System.out.println();
        lap4.DisplayDetails();

    }
}
class LapStore{
    String brand;
    String model;
    int ram;
    int price;  
    LapStore(String brand){
        this(brand, "UnKnown", 8 , 0);
    }
    
    LapStore(String brand, String model){
        this(brand, model, 8, 0);
    }

    LapStore(String brand, String model, int ram){
        this(brand,model,ram,ram*7000);
    }

    LapStore(String brand, String model, int ram, int price){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }
    void DisplayDetails () {
        System.out.println("Brand : "+ brand + "\nModel : " + model + "\nRam : " + ram + "\nprice : " +price );
    }
}