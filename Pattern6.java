// 1
// 2 3 
// 3 4 5
// 4 5 6 7 
// 5 6 7 8 9 

import java.util.Scanner;
class Pattern6
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
        int a = 0;
        for(int i=1;i<=n;i++)
        {
            a=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" " + (a++));
                
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern6 obj = new Pattern6();
        obj.getData();
        obj.generatePattern();
    }
}