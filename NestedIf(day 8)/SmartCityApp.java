import java.util.Scanner;

class SmartCityApp
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Welcome to Smart City App");
	System.out.println("1.Electricity Bill");
	System.out.println("2. Water Bill");
	System.out.println("3. Internet Plan");
	System.out.println(" Exit");
	System.out.print(" Please enter your choise: ");
	
	int choise = sc.nextInt();
	
		if (choise == 1) 
		{
            System.out.print("Enter units consumed: ");
            int units = sc.nextInt();
            int bill;
			
			if (units <= 100) 
                bill = units * 2;
            else if (units <= 300) 
                bill = units * 3;
            else 
                bill = units * 5;
            
            System.out.println("Electricity Bill = ₹" + bill);
		}
		else if (choise == 2)
		{
			System.out.println("1.Apartment");
			System.out.println("2.Individual House");
			System.out.println("Please enter the house type");
			
			int houseType = sc.nextInt();
			int charge;
			
			if (houseType == 1) 
                charge = 300;
            else if (houseType == 2) 
                charge = 500;
            else 
                charge = 0;
                System.out.println("Invalid house type!");
		}
				
		else if (choise == 3)
		{
            System.out.println("1. Basic Plan – ₹399");
            System.out.println("2. Standard Plan – ₹699");
            System.out.println("3. Premium Plan – ₹999");
            System.out.print("Enter plan choice: ");
            int plan = sc.nextInt();

            if (plan == 1) 
                System.out.println("You selected Basic Plan – ₹399");
            else if (plan == 2) 
                System.out.println("You selected Standard Plan – ₹699");
            else if (plan == 3) 
                System.out.println("You selected Premium Plan – ₹999");
            else 
                System.out.println("Invalid plan choice!");
        }

        else if (choise == 4) 
            System.out.println("Thank you for using Smart City Utility System");
        else 
            System.out.println("Invalid choice!");
			
		sc.close();
		
	 
	}

	
	
}