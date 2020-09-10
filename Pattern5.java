// 5 4 3 2 1 
// 5 4 3 2 
// 5 4 3 
// 5 4
// 5 

import java.util.Scanner;
class Pattern5
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
            for(int j=5;j>=i;j--)
            {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern5 obj = new Pattern5();
        obj.getData();
        obj.generatePattern();
    }
}