import java.util.Scanner;

public class LanguageApp 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select Language: "); 
        System.out.println("1.Tamil"); 
        System.out.println("2.English");
        System.out.println("3.Hindi"); 
        System.out.println("4.Malayalam"); 
        System.out.print("Enter your Language: "); 
        int choice = sc.nextInt();
        
        switch (choice)
		{
            case 1:
                System.out.println("Selected: Tamil");
                break;
            case 2:
                System.out.println("Selected: English");
                break;
            case 3:
                System.out.println("Selected: Hindi");
                break;
            case 4:
                System.out.println("Selected: Malayalam");
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}