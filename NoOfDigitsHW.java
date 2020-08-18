import java.util.Scanner;
class NoOfDigitsHW
{
    int num;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
         num= sc.nextInt();
    }
    void digitCount()
    {
        
        int n= num;//preserved copy
        int count = 0;
        while(n!=0)
        {
            int i=n%10;
            count=count + 1;
            n=n/10;
        }
        System.out.println( count);
    }
    
}