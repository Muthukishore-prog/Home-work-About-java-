import java.util.Scanner;
class Practice1
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	 System.out.print("Enter the array lenght: ");
	 
	 
	 int len = sc.nextInt();
	 int arr[] = new int[len];
	 int maxi = 0;
	 for (int i=0; i<arr.length;i++)
		 
	 {
		 System.out.print("Enter the"+i+"array");
		 arr[i]=sc.nextInt();
	 }
	 
	 for ( int i=0; i<arr.length; i++)
	  { 
		if(arr[i]>maxi)
		{
			
			maxi=arr[i];
			
		}
	  }	
	  System.out.println("The highest value is:"+maxi);
	}
}