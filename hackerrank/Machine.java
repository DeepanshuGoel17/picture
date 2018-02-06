package hackerrank;
class Mach{

    public void start(){

        System.out.println("Machine Started");
    }
}

class Camera extends Mach{
     public void start(){

            System.out.println("Camera Started");
        }
     public void snap(){
         System.out.println("Photo taken");
     }
 }
public class Machine{

public static void main(String args[]){	
Mach machine1 = new Camera();//upcasting 
Mach mac = new Mach();
Camera cam = new Camera();

mac= cam;//Downcasting type 1
machine1.start();

mac.start();
cam  =(Camera)mac;  //Downcasting type 2 
mac.start();
}


}