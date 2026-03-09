import java.util.Scanner;

class BankAccount
{
    double balance = 1000;

    void deposit(double amount) 
	{
        balance += amount;
        System.out.println("Amount deposited");
    }

    void withdraw(double amount) 
	{
        if (amount <= balance) 
		{
            balance -= amount;
            System.out.println("Amount withdrawn");
        } else 
		{
            System.out.println("Insufficient balance");
        }
    }

    void display() 
	{
        System.out.println("Balance = " + (int)balance);
    }
}

class BankMenu 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        while (true) 
		{
            choice = sc.nextInt();
            if (choice == 1) {
                account.deposit(sc.nextDouble());
            } else if (choice == 2) 
			{
                account.withdraw(sc.nextDouble());
            } else if (choice == 3) 
			{
                account.display();
            } else if (choice == 4) 
			{
                System.out.print("Exit");
                break;
            }
        }
    }
}