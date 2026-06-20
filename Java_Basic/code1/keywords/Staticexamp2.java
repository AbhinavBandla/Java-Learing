class Apartment{
    String flatname;
    int flatnum;
    static String appName = "Tranquuil Towers";


    Apartment(String flatname, int flatnum){
        this.flatname = flatname;
        this.flatnum = flatnum;
    }

    void display(){
        System.out.println( flatname + " " + flatnum + "  " + Apartment.appName);
    }
    
}
class stabase{
    public static void main(String[] args){
       Apartment a1 = new Apartment("Ganesg's",503);
       Apartment a2 = new Apartment("Suilaja", 504);

       a1.display();         //****  here static remains Trtanquil towers"
       a2.display();
       
       Apartment.appName= "Sky Towers";// according to order it will modify the static key-word
        a1.display();
        a2.display();   // here static var changes to the sky towers 
    }
}