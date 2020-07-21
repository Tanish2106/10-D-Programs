public class sum_of_cubes_of_odd_numbers
{
    public void cubes()
    {
        int sum=0;
        for(int i=1; i <10; i+=2)
        {
            sum +=(i*i*i);
        }
        System.out.println("Sum of cubes of odd numbers between 1 and 10 is " + sum);
    }
}