import java.util.Scanner;
class SeriesHW    //1 + x^0 + x^1 + x^n;
{
    int n;
    int x;
    void input()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Base");
        x = inp.nextInt();
        System.out.println("Enter number of terms");
        n = inp.nextInt();
        inp.close();
    }
    void compute()
    {
        int sum = 0;
        for(int i=0;i<+n;i++)
        {
            sum+=Math.pow(x,i);
        }
        System.out.println("The Sum of the series is: " + sum);
    }
    public static void main()
    {
        SeriesHW obj = new SeriesHW();
        obj.input();
        obj.compute();
    }
}