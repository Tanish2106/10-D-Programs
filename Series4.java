//1-2+3-4+....n

import java.util.Scanner;

class Series4
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    void compute()
    {
        int i=0,sum=0;
        for(;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum = sum + i;
            }
            else
            {
                sum = sum - i;
            }
        }
        System.out.println("The Sum is " + sum);
    }
    public static void main()
    {
        Series4 obj = new Series4();
        obj.getData();
        obj.compute();
    }
}
        
        
    
        
        
        
        
    