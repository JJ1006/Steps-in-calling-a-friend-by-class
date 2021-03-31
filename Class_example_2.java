
import java.util.*;
public class Class_example_2{
    public static void main(String[] args) {
        cellphone apple = new cellphone();
        apple.call();
        apple.ring();
        apple.vibrate();
    }    
}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
     System.out.println("Vibration, now you can talk...");
    } 
     public void call(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nPlease enter the name : ");
    String friend = sc.nextLine();
    System.out.println("Calling... "+friend);
    sc.close();
    }
 }