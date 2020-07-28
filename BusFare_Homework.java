public class BusFare_Homework
{
    void compute(double distance)
    {
        if(distance<=1)
        {
            double fare = distance*4.00;
            System.out.println("The Bus Fare is Rs: " + fare);
        }
        else if(distance>1 && distance<=5)
        {
            double fare = 4.00 + (distance-1)*4.00;
            System.out.println("The Bus Fare is Rs: " + fare);
        }
        else if(distance>5 && distance<=15)
        {
            double fare = 4.00 + 16.00 + (distance-5)*6.00;
            System.out.println("The Bus Fare is Rs: " + fare);
        }
        else
        {
            double fare = 4.00 + 16.00 + 60.00 + (distance-15)*8.00;
            System.out.println("The Bus Fare is Rs: " + fare);
        }
    }
}
            