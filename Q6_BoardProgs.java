import java.util.Scanner;
public class Q6_BoardProgs
{
    long ISBN_Number,tempo,n;
    long Sum=0;
    void getData()
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a 10 digit number to check whether it is an ISBN number or not");
       ISBN_Number=sc.nextLong();      
    }
    void check()
    {
        if((ISBN_Number<=(1111111111 * 9)) && (ISBN_Number>=1000000000))
        {
            long n=ISBN_Number;
            for(long i=1;i<=10;i++)
            {
                tempo=n%10;
                Sum= Sum+(tempo*i);
                n=n/10;
            }
            if((Sum%11)==0)
            {
                System.out.println("The number is an ISBN number");
            }
            else
            {
                System.out.println("The number is not an ISBN number");
            }
        }
        else
        {
             System.out.println("The number entered is not a 10 digit number");
        }
    }
    public static void main()
    {
        Q6_BoardProgs obj= new Q6_BoardProgs();
        obj.getData();
        obj.check();
    }
}