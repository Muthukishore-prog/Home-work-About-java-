class AgeConversion
{
    public static void main(String[] args)
	{
        int years = 20;

        int months = years * 12;
        int days = years * 365;   
        int hours = days * 24;

        System.out.println("Months = " + months);
        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
    }
}