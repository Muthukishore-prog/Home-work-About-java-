import java.util.Scanner;

 class ForLoop
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
		{
            System.out.println(i);
        }
    }
}