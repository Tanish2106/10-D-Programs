import java.util.Scanner;
class MathematicalTable
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int N,t;
        System.out.println("Enter any Number");
        if(in.hasNextInt())
        {
            N = in.nextInt();
            t=1;
            for(int i=1;i<=10;i++)
            {
                t = N*i;
                System.out.println(N + "* " + i + " = " + t);
                System.out.println();
            }
        }
        else
        {
            System.out.println("Non-Integer Value Entered");
        }
    }
}
             
