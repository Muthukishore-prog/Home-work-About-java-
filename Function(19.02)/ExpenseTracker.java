import java.util.Scanner;

class ExpenseTracker
{
    static double[] expenses = new double[100];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
	{
        int choice;

        do 
		{
            System.out.println(" Daily Expense Tracker ");
            System.out.println("1. Add expense");
            System.out.println("2. View all expenses");
            System.out.println("3. Calculate total expense");
            System.out.println("4. Find highest expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    calculateTotalExpense();
                    break;
                case 4:
                    findHighestExpense();
                    break;
                case 5:
                    System.out.println("Exiting tracker");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    static void addExpense() 
	{
        if (count >= expenses.length)
			{
            System.out.println("Expense list is full!");
            return;
            }
        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        expenses[count] = amount;
        count++;
        System.out.println("Expense added successfully.");
    }

    static void viewAllExpenses() 
	{
        if (count == 0)
		{
            System.out.println("No expenses recorded yet.");
            return;
        }
        System.out.println("--- All Expenses ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + expenses[i]);
        }
    }

    static void calculateTotalExpense()
	{
        double total = 0;
        for (int i = 0; i < count; i++) 
		{
            total += expenses[i];
        }
        System.out.println("Total Expense: " + total);
    }

    static void findHighestExpense() 
	{
        if (count == 0) 
		{
            System.out.println("No expenses to evaluate.");
            return;
        }
        double highest = expenses[0];
        for (int i = 1; i < count; i++) 
		{
            if (expenses[i] > highest)
			{
                highest = expenses[i];
            }
        }
        System.out.println("Highest Expense: " + highest);
    }
}