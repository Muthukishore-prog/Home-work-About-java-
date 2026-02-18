import java.util.Scanner;
class Practice3
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	 System.out.print("Enter the array lenght: ");
	 
	 int len = sc.nextInt();
	 int arr[] = new int[len];
	 
	 for (int i=0; i<arr.length;i++)
		 
	 {
		 System.out.print("Enter the"+i+"array");
		 arr[i]=sc.nextInt();
	 }
	 int sum = 0;
	 for (int i=0; i<arr.length;i++)
	 {
		 sum+=arr[i];
	 }
	 System.out.println("the sum of array is: "+sum);
	} 
}