public class Q9_BoardProgs
{
    void series1()
    {
        boolean a=true;
        int sum=0;
        for(int i=2;i<=20;i+=2)
        {
            if(a==true)
            {
                sum=sum+i;
                a=false;
            }
            else
            {
                sum=sum-i;
                a=true;
            }
        }
        System.out.println("The sum is "+ sum);
    }
    void series2(double x)
    {
        double sum=0;
        for(double i=2;i<=20;i+=3)
        {
            sum=sum+x/i;
        }
        System.out.println("The sum is "+ sum);
    }
    public static void main()
    {
        Q9_BoardProgs obj = new Q9_BoardProgs();
        obj.series1();
        obj.series2(5.0);
    }    
}
