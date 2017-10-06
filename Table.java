
/**
 * Write a description of class Table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table
{
    public static void main() {
        buildHeader();
        buildTable();
    }
    
    public static void buildHeader() {
        System.out.println("------------------------------");
        System.out.println("==      Student Points      ==");
        System.out.println("------------------------------");
        
    }
    
    public static void buildTable() {
        System.out.println("Name       Lab   Bonus   Total");
        System.out.println("----       ---   -----   -----");
        System.out.println("Elias       70     30     100");
        System.out.println("Bob         40     40      80");
        System.out.println("Paul        30     0       30");
        
    }
}
