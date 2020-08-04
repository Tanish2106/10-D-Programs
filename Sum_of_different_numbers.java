import java.util.Scanner;
class Sum_of_different_numbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number(0-to exit):");
        if(in.hasNextInt())
        {
            int n = in.nextInt();
            int sum_negative = 0, sum_positive_odd =0, sum_positive_even = 0;
            for(int i = 1;n!=0;i++)
            {
                if(n<0)
                {
                    sum_negative = sum_negative + n;
                }
                else if((n>0)&&(n%2!=0))
                {
                    sum_positive_odd = sum_positive_odd + n;
                }
                else if((n>0)&&(n%2==0))
                {
                    sum_positive_even = sum_positive_even + n;
                }
                System.out.println("Enter next number");
                if(in.hasNextInt())
                {
                    n = in.nextInt();
                }
                else
                {
                    System.out.println("Non-Integer Value Entered");
                    break;
                }
            }
            System.out.println("Sum of Negative Numbers: " + sum_negative);
            System.out.println("Sum of Positive Even Numbers: " + sum_positive_even);
            System.out.println("Sum of Positive Odd Numbers: " + sum_positive_odd);
        }
        else
        {
            System.out.println("Non-Integer Value Entered");
        }
    }
}
        
        
        