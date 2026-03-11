class Vehicle 
{
    String brand;
    int year;

    Vehicle(String brand, int year) 
	{
        this.brand = brand;
        this.year = year;
    }

    void displayBaseInfo() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle 
{
    int seats;

    Car(String brand, int year, int seats) 
	{
        super(brand, year);
        this.seats = seats;
    }

    void displayCarInfo() 
	{
        System.out.println("Car:");
        displayBaseInfo();
        System.out.println("Seats: " + seats);
    }
}

class Motorcycle extends Vehicle 
{
    String type;

    Motorcycle(String brand, int year, String type) 
	{
        super(brand, year);
        this.type = type;
    }

    void displayMotorcycleInfo() 
	{
        System.out.println("Bike:");
        displayBaseInfo();
        System.out.println("Type: " + type);
    }
}

class VehicleManagementSystem 
{
    public static void main(String[] args) 
	{
        System.out.println("Vehicle Management System");
        System.out.println("-------------------------");

        Car myCar = new Car("Toyota", 2022, 5);
        myCar.displayCarInfo();

        System.out.println();

        Motorcycle myBike = new Motorcycle("Yamaha", 2020, "Sports");
        myBike.displayMotorcycleInfo();
    }
}