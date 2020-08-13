import java.util.Scanner;

class Series3   //1 + (1+2) + (1+2+3) + (1+2+3+...n)
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sc.nextInt();
    }
    void compute()
    {
        int i=0,sum=0;
        for( i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of the series is: " + sum);
    }
    public static void main()
    {
        Series3 obj = new Series3();
        obj.getData();
        obj.compute();
    }
}