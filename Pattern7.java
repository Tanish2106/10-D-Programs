// a
// B B
// c c c 
// D D D D
// e e e e e
 
import java.util.Scanner;
class Pattern7
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
        char ch=64;//ascii code from 65 to 90 represents capital characters
        for(int i=1;i<=n;i++)
        {
            ch++;
            if(i%2==0)// for odd row numbers uppercase characters
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" " + ch);
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" " + Character.toLowerCase(ch));
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern7 obj = new Pattern7();
        obj.getData();
        obj.generatePattern();
    }
}
            
                    