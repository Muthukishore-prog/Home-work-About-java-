import java.util.Scanner;

 class SecondMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least two distinct numbers.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current < min) {
                // Update both: old min is now the runner-up
                secondMin = min;
                min = current;
            } else if (current < secondMin && current != min) {
                // Update only the runner-up
                secondMin = current;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No unique second minimum found.");
        } else {
            System.out.println("The second minimum element is: " + secondMin);
        }
        
        sc.close();
    }
}