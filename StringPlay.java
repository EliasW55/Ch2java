// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
          String college = new String ("PoDunk College");

          String town = new String("AnyTown");
          
          int stringLength = 14;
          String change1, change2, change3;
 
 
          System.out.println (college + " contains " + stringLength + " characters.");
 
          change1 = new String("PODUNK COLLEGE");
 
          change2 = new String("P*DUNK C*LLEGE");
 
          change3 = new String (college + town);
 
          System.out.println ("The final string is " + change3);
        }
}
