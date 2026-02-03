// 5) Positive / Negative / Zero
        int num = -8;
        if (num > 0) System.out.println("Positive number");
        if (num < 0) System.out.println("Negative number");
        if (num == 0) System.out.println("Zero");

        // 6) Pass or Fail
        int mark = 65;
        if (mark >= 50) System.out.println("Pass");
        else System.out.println("Fail");

        // 7) Using += operator
        int x = 10;
        x += 5;
        System.out.println("x = " + x);

        // 8) Using *= operator
        int salary = 10000;
        salary *= 2;
        System.out.println("Updated Salary = " + salary);

        // 9) Voting eligibility (Logical AND)
        int age = 20;
        boolean isCitizen = true;
        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to Vote");
        }

        // 10) Number between 10 and 50
        int rangeNum = 35;
        if (rangeNum >= 10 && rangeNum <= 50) {
            System.out.println("Number is in range");
        }

        // 12) Grade calculation (Nested or sequential ifs instead of else if)
        int marks = 92;
        if (marks >= 90) System.out.println("Grade A");
        if (marks >= 80 && marks < 90) System.out.println("Grade B");
        if (marks < 80) System.out.println("Grade C or below");

        // 14) Leap year check
        int year = 2024;
        // A year is a leap year if divisible by 4 but NOT 100, OR divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }