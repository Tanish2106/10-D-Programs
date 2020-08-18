import java.util.Scanner;
class AverageOfDigitsHW
{
    int num,sum=0,count=0,n=num,n1=num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
    }
    public void compute()
    {
        
        int digit=0;
        
        while(n!=0)
        {
            digit=n%10;
            sum= sum+digit;
            n=n/10;
        }
    }
    public void count()
    {
       while(n1!=0)
       {
            int i=n1%10;
            count=count + 1;
            n1=n1/10;
       }
       double average = sum/count;
    }
}
    
        
