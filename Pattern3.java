// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

import java.util.Scanner;
class Pattern3
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern");
        n = sc.nextInt();
    }
    void generatePattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern3 obj = new Pattern3();
        obj.getData();
        obj.generatePattern();
    }
}