public class SeriesAssignment
{
    public double series(double n)
    {
        double sum= 0;
        for(double i=1;i<=n;i++)
        {
            sum = sum + 1/i;
        }
        return sum;
    }
    double series(double a, double n)
    {
        double sum = 0;
        for(double i=0;i<n;i++)
        {
            sum = sum + ((3*i+1.0)/Math.pow(a,3*i+2));
        }
        System.out.println("The sum of the series is " + sum);
        return sum;
    }
    public static void main(String args[])
    {
        SeriesAssignment obj = new SeriesAssignment();
        obj.series(5.0);
        obj.series(2.0,5.0);
    }
}
