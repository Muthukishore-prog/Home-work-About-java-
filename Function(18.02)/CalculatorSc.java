import java.util.Scanner;

class CalculatorSc 
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java Calculator");
        System.out.println("1  Addition");
        System.out.println("2  Subtraction");
        System.out.println("3  Multiplication");
        System.out.println("4  Division");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
		int result = 0;

       
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
				
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
				
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
				
            case 4:
                 result = num1 / num2;
                 System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                break;
				
            default:
                System.out.println("Invalid choice! Please select the value between 1-4.");
                
        }

        scanner.close();
    }
}