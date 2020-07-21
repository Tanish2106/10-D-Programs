public class PayRoll
{
    public void PayRoll(long HoursWorked, double PayRate, double TaxRate)
    {
        System.out.println("Number of hours worked:" + HoursWorked);
        System.out.println("Pay Amount:" + (HoursWorked*PayRate));
        System.out.println("Tax Amount:" + (HoursWorked*PayRate*TaxRate));
    }
}
        