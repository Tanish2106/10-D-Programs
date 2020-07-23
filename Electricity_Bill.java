class Electricity_Bill
{
    double bill;
    
    void accept( int units )
    {
        int u;
        u=units;
    }
    void compute( int units)
    {
        if ( units>0 && units<=100 )
        {
            bill = units*40/100;
        }
        else if ( units>100 && units<=300 )
        {
            bill = 100*40/100 + (units-100)*60/100;
        }
        else
        {
            bill = 100*40/100 + 200*60/100 + (units-300)*1;
        }
        bill = bill + 500;
        System.out.println("The Bill is Rs: " + bill);
    }
    public static void main()
    {
        Electricity_Bill obj = new Electricity_Bill();
        obj.accept(150);
        obj.compute(160);
    }
}
