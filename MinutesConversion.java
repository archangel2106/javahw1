package JavaClassHomework1;
import java.util.Scanner;
public class MinutesConversion 
{
    public static void main(String[] args)
    {
    int minutes_in_hour = 60;
    int minutes_in_a_day = 1440;
    double minutes_to_hours = (minutes_requested/minutes_in_hour);
    double minutes_to_days = (minutes_requested/minutes_in_a_day);
    
    Scanner imp = new Scanner (System.in);
    System.out.print("How many minutes would you like to convert?");
    int minutes_requested = imp.nextInt();
    
    System.out.println("You selected " + minutes_requested + " minutes "); 
    System.out.println("That's " + minutes_to_hours + " hours");
    System.out.println("That's " + minutes_to_days + " days");
    }
}
