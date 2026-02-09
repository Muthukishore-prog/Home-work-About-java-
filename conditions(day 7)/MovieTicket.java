import java.util.Scanner;

public class MovieTicket 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age < 12) 
            System.out.println("Ticket Price: 80");
        else if (age >= 12 && age <= 59) 
            System.out.println("Ticket Price: 150");
        else if (age >= 60) 
            System.out.println("Ticket Price: 100");
        else 
            System.out.println("Invalid Age Entered.");
        
    }
}