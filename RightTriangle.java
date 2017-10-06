import java.util.Scanner;
// *******************************************************************
//   RightTriangle.java
//
//   Compute the length of the hypotenuse of a right triangle
//   given the lengths of the sides         
// *******************************************************************
 
public class RightTriangle
{
   public static void main (String[] args)
   {
          Scanner keyboard = new Scanner(System.in);
          double side1=0, side2=0;  // lengths of the sides of a right triangle
               // length of the hypotenuse
 
          // Get the lengths of the sides as input
          System.out.print ("Please enter the length of one side of a right triangle ");
          side1 = keyboard.nextDouble();
          
          System.out.print ("Please enter the length of the other side of a right triangle ");
          side2 = keyboard.nextDouble();
          
     
          double hypotenuse = Math.sqrt((side1*side1)+(side2*side2));   
          
 
     
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
        }
}