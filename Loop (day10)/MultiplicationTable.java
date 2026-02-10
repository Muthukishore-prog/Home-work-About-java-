import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a table number: ");
        int tab = scanner.nextInt();
        
        int i = 1; 
        
        System.out.println("Multiplication Table for " + tab);
        
        while (i <= 10)
		{
            System.out.println(tab + " x " + i + " = " + (tab * i));
            
            i++;
        }
        
    }
}