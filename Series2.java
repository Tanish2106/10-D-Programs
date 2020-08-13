import java.util.Scanner;

class Series2    //2+5+10+17+26+....n;
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    void Compute()
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum +( i*i+1 );
        }
        System.out.println("The Sum of the Series is: " + sum);
    }
    public static void main()
    {
        Series2 obj = new Series2();
        obj.getData();
        obj.Compute();
    }
}
        
    
       
            
        
   