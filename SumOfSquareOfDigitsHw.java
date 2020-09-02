import java.util.Scanner;
class SumOfSquareOfDigitsHw
{
    int num;
    void readNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
    }
    void sumOfsquare()
    {
        int digit1 , digit2 , digit3, n=num;
        digit1=n%10;
        n=n/10;
        digit2=n%10;
        n=n/10;
        digit3=n%10;
        
        digit1=digit1*digit1;
        digit2=digit2*digit2;
        digit3=digit3*digit3;
        
        int sum = digit1 + digit2 + digit3;
        System.out.println("Sum is " + sum);
    }
}
        