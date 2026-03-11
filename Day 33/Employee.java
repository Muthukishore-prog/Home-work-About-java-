class Employee
 {
    String name;
    double salary;

    Employee(String name, double salary) 
	{
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeInfo()
	{
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Manager extends Employee 
{
    String department;

    Manager(String name, double salary, String department) 
	{
        super(name, salary);
        this.department = department;
    }

    void displayManagerInfo() {
        displayEmployeeInfo(); 
        System.out.println("Department: " + department);
    }
}

class EmployeeManagement 
{
    public static void main(String[] args) 
	{
        System.out.println("Employee Management System");
        System.out.println("--------------------------");

        Employee emp = new Employee("Alice", 50000.0);
        emp.displayEmployeeInfo();

        System.out.println(); 

        Manager mgr = new Manager("Bob", 80000.0, "IT");
        mgr.displayManagerInfo();
    }
}