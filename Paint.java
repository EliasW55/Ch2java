//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            int width=10, length=7, height=10;
            double totalsqft=length*width*height, paintNeeded=totalsqft/350;
 

 
            System.out.println ("The dimensions of the room are: " + length
                                               + " x " + width + " x " + height);
            System.out.println ("The total square feet of the room is: " + totalsqft);
            System.out.println ("The amount of gallons needed are: " + paintNeeded);
        }
}
