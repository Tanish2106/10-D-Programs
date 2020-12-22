import java.util.Scanner;
class Q15_BoardProgs
{
    int[] AW;
    Q15_BoardProgs()
    {
        AW = new int[8];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 8 Elements of the Array");
        for(int i=0;i<=AW.length-1;i++)
        {
            AW[i] = sc.nextInt();
        }
    }
    void calculate()
    {
        for(int i=0;i<AW.length;i++)
        {
            if(AW[i] % 10 == 3)
            {
                System.out.println(AW[i]);
            }
        }
    }
    public static void main()
    {
        Q15_BoardProgs obj = new Q15_BoardProgs();
        obj.input();
        obj.calculate();
    }
}
        