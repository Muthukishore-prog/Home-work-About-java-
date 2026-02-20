import java.util.Scanner;
 
class ScoreAnalyzer
{
    static int[] scores = new int[100];
    static int count = 0;
    static final int passmark = 50; 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
	{
        int choice;

        do 
		{
            System.out.println("Exam Score Analyzer ");
            System.out.println("1. Add exam score");
            System.out.println("2. Display all scores");
            System.out.println("3. Count pass scores");
            System.out.println("4. Count fail scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    addExamScore();
                    break;
                case 2:
                    displayAllScores();
                    break;
                case 3:
                    countPassScores();
                    break;
                case 4:
                    countFailScores();
                    break;
                case 5:
                    System.out.println("Exiting analyzer");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    static void addExamScore() 
	{
        if (count >= scores.length) 
		{
            System.out.println("Score list is full!");
            return;
        }
        System.out.print("Enter exam score (0-100): ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) 
		{
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else 
		{
            scores[count] = score;
            count++;
            System.out.println("Score added successfully.");
        }
    }

    static void displayAllScores() 
	{
        if (count == 0) 
		{
            System.out.println("No scores recorded yet.");
            return;
        }
        System.out.println("All Exam Scores ");
        for (int i = 0; i < count; i++) 
		{
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
        }
    }

    static void countPassScores() 
	{
        int passCount = 0;
        for (int i = 0; i < count; i++) 
		{
            if (scores[i] >= passmark) 
			{
                passCount++;
            }
        }
        System.out.println("Total Pass Scores: " + passCount);
    }

    static void countFailScores() 
	{
        int failCount = 0;
        for (int i = 0; i < count; i++) 
		{
            if (scores[i] < passmark) 
			{
                failCount++;
            }
        }
        System.out.println("Total Fail Scores: " + failCount);
    }
}