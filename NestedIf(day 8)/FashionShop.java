import java.util.Scanner;

class FashionShop 
{

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to FashionShop");
        System.out.println("1.Men");
        System.out.println("2.Women");
        System.out.println("3.Kids");
		
		int choise = sc.nextInt();
		switch(choise)
	   {
		  
			case 1:
			{
				System.out.println("1.Cotton Shirt");
				System.out.println("2.Baggyn");
				System.out.println("3.Formal T shirt");
				System.out.print("Enter your option: ");
				int option = sc.nextInt();
				if (option==1)
					
					 System.out.println("1.Cotton Shirt:450");
				 
				else if(option==2)
					
                    System.out.println("2.Baggy:950"); 
					
				else if(option==3)
                    System.out.println("3.Formal T shirt :550");
				
				else 
					System.out.println("not exits");
		break;
		
			}
		
		    case 2:
			{
				System.out.println("women section");
				System.out.println("1.saree");
				System.out.println("2.chudi");
				System.out.println("3. kurtha");
				System.out.print("Enter your option: ");
				int option=sc.nextInt();
				if (option==1)
					
					 System.out.println("1.Cotton saree:450");
				 
				else if(option==2)
					
                    System.out.println("2.chudi:950"); 
					
				else if(option==3)
                    System.out.println("3. kurtha :550");
				
				else 
					System.out.println("not exits");
			}
		break;
		
		
		
		
				 case 3:
				 {
				System.out.println("kids section");
				System.out.println("1.shorts");
				System.out.println("2.night wear");
				System.out.print("Enter your option: ");
				int option=sc.nextInt();
				if (option==1)
					
					 System.out.println("1.shorts:550");
				 
				else if(option==2)
					
                    System.out.println("night wear:400"); 
					
				else 
					System.out.println("not exits");
				 }
		break;
		
		default:
                System.out.println("Error:");
	   }
	}
}
		
		
			