import java.util.Scanner;

class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid input. You need at least two numbers.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current > max) {
                secondMax = max;
                max = current;
            } else if (current > secondMax && current != max) {
                secondMax = current;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element (all numbers might be the same).");
        } else {
            System.out.println("The second maximum element is: " + secondMax);
        }
        
        sc.close();
    }
}