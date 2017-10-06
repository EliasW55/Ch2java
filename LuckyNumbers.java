// **************************************************
//   LuckyNumbers.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class LuckyNumbers
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int lucky1, lucky2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          lucky1 = generator.nextInt(79) + 50;
          
 
         
 
          lucky2 = (int)(generator.nextFloat()*30) + 11;
 
          System.out.println ("Your lucky numbers are " + lucky1 + " and " + lucky2);
        }
}
