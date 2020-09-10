// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;
class Pattern4
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
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(" " + count);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern4 obj = new Pattern4();
        obj.getData();
        obj.generatePattern();
    }
}