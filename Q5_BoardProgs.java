import java.util.Scanner;
class Q5_BoardProgs
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("Enter 1 to print the triangle of numbers");
        System.out.println("Enter 2 to print the triangle of 5");
        System.out.println("Enter a number other than 1 and 2 to exit");
    }
    void pattern1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    void pattern2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Q5_BoardProgs obj = new Q5_BoardProgs();
        char choice;
        int option;
        
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1 or 2]");
            option = sc.nextInt();
            
            if(option==1)
            {
                obj.pattern1();
            }
            else if(option==2)
            {
                obj.pattern2();
            }
            else
            {
                System.out.println("Invalid Option");
                return;
            }
            
            System.out.println("Enter 'a' to continue and 'b' to exit");
            choice = sc.next().charAt(0);
        }while(choice == 'a');
    }
}