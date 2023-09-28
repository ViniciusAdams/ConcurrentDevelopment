package Lab1;
//Question 1
       // Write a thread that tosses a coin 1000 times and computes the frequency of heads and tails.

import java.util.Random;
public class Lab1 {
public static void main (String[] args){
    int heads = 0;
    int tails = 0;
    Random number = new Random();

for (int i = 0; i< 1000 ; i ++){
    int flip = number.nextInt(2);
    if (flip == 0){
        heads ++;
    }else {
        tails++;
    }
}
System.out.println ("Heads=" + heads);
System.out.println ("Tails=" + tails);
}

}
