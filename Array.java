import java.util.Scanner;
class Array
{
    int[] sArray;
    int sum = 0;
    int average;
    Array()
    {
        sArray = new int[10];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 Elements of the Array");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i] = sc.nextInt();
        }
    }
    void Sum()
    {
        for(int i=0;i<=9;i++)
        {
            sum = sum + sArray[i];
        }
        System.out.println("The Sum of the array elements is " + sum);
    }
    void Average()
    {
        average = sum/10;
        System.out.println("The average of the array elements is " + average);
    }
    public static void main()
    {
        Array obj = new Array();
        obj.input();
        obj.Sum();
        obj.Average();
    }
}
        
    
