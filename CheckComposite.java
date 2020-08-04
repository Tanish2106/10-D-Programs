import java.util.Scanner;
class CheckComposite
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int flag = 0,n;
        if(in.hasNextInt())
        {
            n = in.nextInt();
            for(int j= 2;j<n;j++)
            {
                if(n%j==0)
                {
                    flag++;
                }
            }
            if(flag!=0)
            {
                System.out.println(n + " is a composite number.");
            }
            else
            {
                System.out.println(n + " is not a composite number.");
            }
        }
        else
        {
            System.out.println("Non-Integer value entered");
        }
    }
}
        
    
            
            
                    
