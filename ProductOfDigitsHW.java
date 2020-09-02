import java.util.Scanner;
class ProductOfDigitsHW
{
    int num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
    }
    void Product()
    {
        int n= num;//preserved copy
        int digit=0;
        int prod=1;
        while(n!=0)
        {
            digit=n%10;
            prod= prod*digit;
            n=n/10;
        }
        System.out.println("Product = " + prod);
    }
}