import java.util.Scanner;
class SumOfDigitsHW
{
    int num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
    }
    void Sum()
    {
        int n= num;
        int digit=0;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum= sum+digit;
            n=n/10;
        }
        System.out.println("Sum = " + sum);
    }
}