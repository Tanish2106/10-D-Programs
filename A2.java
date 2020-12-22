import java.util.Scanner;
public class A2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String sArray[] = new String[5];
        System.out.println("Enter");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i] = sc.next();
        }
        for(int i=sArray.length-1;i>=0;i--)
        {
            System.out.println(sArray[i]);
        }
    }
}