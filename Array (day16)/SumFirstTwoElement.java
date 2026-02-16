import java.util.Scanner;

class SumFirstTwoElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Element 1: ");
		System.out.println("Enter the value of Element 2: ");
		System.out.println("Enter the value of Element 3: ");
		
		int Ele1 = sc.nextInt();
		int Ele2 = sc.nextInt();
		int Ele3 = sc.nextInt();
		
		int sum = Ele1 + Ele2;
		
		System.out.println("The sum of first two element is: " + sum);

		
		
	}

}