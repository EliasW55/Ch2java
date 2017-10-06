import java.util.Random;
 
public class Dice
{
    public static void main(String[] args) {
        Random generator = new Random();
        int dice1, dice2;
        dice1=generator.nextInt(6)+1;
        dice2=generator.nextInt(6)+1;
        System.out.println("Your roll was: " + dice1 + " and " + dice2);
        System.out.println("Your total roll was: " + (dice1+dice2));
    }

}
