import java.util.Scanner;
class ReverseOfaNo
{
    int num;
    void readNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
    }
    void reverse()
    {
        int n = num, reverse=0;
        while(n!=0)
        {
            reverse = reverse*10;
            reverse = reverse + n%10;
            n = n/10;
        }
        System.out.println("The reverse of the number is " + reverse);
    }
    public static void main(String args[])
    {
        ReverseOfaNo obj  = new ReverseOfaNo();
        obj.readNumber();
        obj.reverse();
    }
}