class Main{
    public static void main(String[] args){
        Car c1 =  new Car();
        c1.brand = "Audi";
        c1.price = 400000;
        
        c1.showBrand();
        c1.showPrice();
    }
}
class Vehical{
    String brand;
    
    void showBrand(){
        System.out.println(brand);
    }
}
class Car extends Vehical{
    int price;
    
    void showPrice(){
        System.out.println(price);
    }
}