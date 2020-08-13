                               //s = 2! - 4! + 6! - 8! + ....n terms
import java.util.Scanner;

class Series5
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
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
    void compute()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + fact(i);
        }
        System.out.println("The sum is " + sum);
    }
    public static void main()
    {
        Series5 obj = new Series5();
        obj.getData();
        obj.compute();
    }
}
        
        


