//Question 2
//Write a thread that continuously prints a message every 100 milliseconds while it is still alive. It can be terminated at any time by a control program.

package Lab1;

public class Lab1Q2 {
private boolean run =true;
public void star(){
    while (run){
        System.out.println ("Print");
        try{
            Thread.sleep(100);


        }catch (InterruptedException a){
            Thread.currentThread().interrupt();
        }
    }
} public void stop (){
    run = false;
    }
    public static void main (String []args){
    Lab1Q2 print = new Lab1Q2 ();
    Thread t = new Thread(()-> print.star());
    t.start();
try{
    Thread.sleep(500);
}catch (InterruptedException a){
    Thread.currentThread().interrupt();
}
print.stop();
}

}
