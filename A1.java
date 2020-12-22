import java.util.Scanner;
public class A1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sArray[] = new int[10];
        System.out.println("Enter");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i] = sc.nextInt();
        }
        for(int i=0;i<=sArray.length-1;i++)
        {
            if(sArray[i]%2!=0)
            {
                count++;
            }
        }
        System.out.println("The Number of odd number is " + count);
    }
}
                