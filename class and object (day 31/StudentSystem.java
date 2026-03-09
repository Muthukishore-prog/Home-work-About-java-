import java.util.Scanner;

class Student 
{
    String name;
    int rollNo;

    void addDetails(String name, int rollNo) 
	{
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Student details saved");
    }

    void updateName(String newName) 
	{
        this.name = newName;
        System.out.println("Name updated");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class StudentSystem 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        while (true) 
		{
            choice = sc.nextInt();
            switch (choice) 
			{
                case 1:
                    s.addDetails(sc.next(), sc.nextInt());
                    break;
                case 2:
                    s.updateName(sc.next());
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exited");
                    return;
            }
        }
    }
}