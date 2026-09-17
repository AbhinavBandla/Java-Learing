/*
Static Method In InterFace
        A static method in an interface is a method that belongs to the
        interface itself, not to the objects of implementing classes.

A static method in an interface can be called from wherever it is accessible in your code,
but you call it using the name of the class/interface where that static method is declared.
*/
interface Payment{
    static void paymentInfo(){
        System.out.println("Payment is Secure");
    }
}
class UPI implements Payment{
}
//2
interface Camera{
    static void cameraInfo(){
        System.out.println("Camera is ready");
    }
}
class SmartPhone implements Camera{

}
//3
interface MusicPlayer {
    static void showPlayerInfo(){
        System.out.println("Music player supports audio playback");
    }
}
class MP3 implements MusicPlayer{

}
class staticMethod{
    public static void main(String[] args){
        //3
        MP3 m1 = new MP3();
        MusicPlayer.showPlayerInfo();
        //2
        Camera.cameraInfo();
        SmartPhone sm1 = new SmartPhone();
        //1
        Payment.paymentInfo();
    }
}