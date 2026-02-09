import java.util.Scanner;

public class BatteryCheck 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();
        
        if (battery >= 80 && battery <= 100) 
            System.out.println("Battery Full");
        else if (battery >= 30 && battery < 80) 
            System.out.println("Battery Normal");
        else if (battery >= 0 && battery < 30) 
            System.out.println("Low Battery Charge Now");
        else 
            System.out.println("Invalid percentage.");
        
    }
}