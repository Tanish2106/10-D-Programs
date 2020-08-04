import java.util.Scanner;
class Factors
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int i,N;
        if(in.hasNextInt())
        {
            N = in.nextInt();
            System.out.println("The Factors of " + N + " are : ");
            for(i=1;i<=N;i++)
            {
                if(N%i==0)
                {
                    System.out.println(i + "");
                }
            }
            System.out.println();
        }
        else
        {
            System.out.println("Non-Integer value entered");
        }
    }
}
            
            