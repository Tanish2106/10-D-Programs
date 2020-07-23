class Weekly_Wages
{
    double weekly_wages;
    void compute( int h , double r )   // h is the no of hours worked and r is the hourly rate
    {
        if(h>0 && h<=35)
        {
            weekly_wages = h*r;
        }
        else if(h>35 && h<=60)
        {
            weekly_wages = 35*r + (h-35)*r*15/10;
        }
        else if(h>60 && h<=70)
        {
            weekly_wages = 35*r + 25*r*15/10 + (h-60)*r*2;
        }
        else
        {
            System.out.println("Maximum hours can only be 70");
         }
        System.out.println("The Weekly Wages are Rs: " + weekly_wages);
    }
    public static void main( String args[])
    {
        Weekly_Wages obj = new Weekly_Wages();
        obj.compute( 50 , 7.5 );
    }
}
        

        