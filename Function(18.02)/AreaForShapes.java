import java.util.Scanner;

class AreaForShapes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("-----Area Calculator----");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Square");
		System.out.println("4. Triangle");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");
		
		choice = sc.nextInt();
		
		switch (choice)
		    {
			case 1:
				System.out.print("Enter your length: ");
				int l = sc.nextInt();
				
				System.out.print("Enter your width: ");
				int w = sc.nextInt();
				
				System.out.print("Area of Rectangle: " + rec(l,w));
			break;
			
			case 2:
				System.out.print("Enter your radius: ");
				double r = sc.nextInt();
				
				System.out.print("Area of Circle: " + cir(r));
			break;
			
			case 3:
				System.out.print("Enter your side length: ");
				int sl = sc.nextInt();
				
				System.out.print("Area of Square: " + sqr(sl));
			break;
			
			case 4:
				System.out.print("Enter your base: ");
				int b = sc.nextInt();
				
				System.out.print("Enter your height: ");
				int h = sc.nextInt();
				
				System.out.print("Area of Triangle: " + tri(b,h));
			break;
			
			case 5:
				System.out.print("Exiting the Calculator");
			break;
			
			default:
				System.out.print("Invali please select the choice between 1-5");
			}
				
		}while (choice != 5);			
	}
			static int rec(int length, int width) 
			{
			return length * width;
			}

			static double cir(double radius)
			{
			return Math.PI * radius * radius;
			}

			static int sqr(int side) 
			{
			return side * side;
			}

			static double tri(int base, int height) 
			{
			return 0.5 * base * height;
			}
}