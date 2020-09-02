public class NumbersHW
{
    
    public static int TestNumber(int n)
    {
        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                 sum = sum + i;
            }
        }
        int a = -1,b = 0, c = 1;
        if(sum<(2*n))
        {
            return a;
        }
        else if(sum==(2*n))
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public void printNumberType(int n)
    {
        int x;
        x = TestNumber(n);
        if(x==-1)
        {
            System.out.println("Deficient Number");
        }
        else if(x==0)
        {
            System.out.println("Perfect Number");
        }
        else if(x==1)
        {
            System.out.println("Abundant Number");
        }
    }
    public static void main(String args[])
    {
        NumbersHW obj = new NumbersHW();
        obj.printNumberType(6);
    }
}