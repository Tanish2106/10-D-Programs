//S=1+2/1*2 + 1+2+3/1*2*3 +...+ 1+2+3...+n/1*2*3*...*n
import java.util.Scanner;
class Series6
{
    int n;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        n=sc.nextInt();
    }
    int seqSum(int m)
    {
        int s=0;
        for (int i=1;i<=m;i++)
        s=s+i;
        
        return s;
    }
    int fact(int m)
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        prod=prod*i;
        
        return prod;
    }
    void computeSum()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
         sum=sum+(int)seqSum(i+1)/fact(i+1);
        }
        System.out.println();
    }
    public static void main()
    {
        Series6 obj = new Series6();
        obj.getData();
        obj.computeSum();
    }
}