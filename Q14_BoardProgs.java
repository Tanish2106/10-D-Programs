import java.util.Scanner;
class Q14_BoardProgs
{
    double[] sArray;          
    double average;
    double sum = 0;
    Q14_BoardProgs()          
    {
        sArray = new double[10];
    }
    void initialize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 elements of the array");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i] = sc.nextInt();
        }
    }
    void CalculateAverage()
    {
        for(int i=0;i<10;i++)
        {
            sum = (sum + sArray[i]);
        }
        average = sum/10;
        for(int i=0;i<10;i++)
        {
            if(sArray[i]>average)
            {
                System.out.println(sArray[i]);
            }
        }
    }
    public static void main()
    {
        Q14_BoardProgs obj = new Q14_BoardProgs();
        obj.initialize();
        obj.CalculateAverage();
    }
}
        