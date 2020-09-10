// 5
// 5 4
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1
import java.util.Scanner;
class Pattern9
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
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern9 obj = new Pattern9();
        obj.getData();
        obj.generatePattern();
    }
}
                
        