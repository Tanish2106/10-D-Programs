import java.util.Scanner;
class Series      //x^1/1! + x^2/2! + x^3/3! ...... x^n/n!
{
    int n;
    int x;
    
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        x = sc.nextInt();
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
    }
    int fact(int m)
    {
        int prod = 1;
        for(int i=1;i<=m;i++)
        {
            prod = prod*i;
        }
        return prod;
    }
    void computeSum()
    {
        double sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + (Math.pow(x,i))/fact(i);
        }
        System.out.println("The sum of the series is: " + sum);
    }
    public static void main()
    {
        Series obj = new Series();
        obj.getData();
        obj.computeSum();
    }
}