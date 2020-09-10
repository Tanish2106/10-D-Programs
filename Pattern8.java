// 5 5 5 5 5
// 5 4 4 4 4
// 5 4 3 3 3
// 5 4 3 2 2
// 5 4 3 2 1

import java.util.Scanner;
class Pattern8
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
        for(int i=1;i<=n;i++)    //number of rows
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" " + (n-(j-1)));
            }
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" " + (n-(i-1)));
            }
            System.out.println();
        }
        }
    public static void main()
    {
            Pattern8 obj = new Pattern8();
            obj.getData();
            obj.generatePattern();
    }
}
            