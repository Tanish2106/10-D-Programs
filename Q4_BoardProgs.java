import java.util.Scanner;
class Q4_BoardProgs
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1.Term Deposit");
        System.out.println("2.Recurring Deposit");
        System.out.println("Enter a number other than 1 and 2 to exit");
    }
    void termDeposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        int principal = sc.nextInt();
        System.out.println("Enter the Rate of Interest");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in years");
        int timePeriod = sc.nextInt();
        
        double x = (1+(rate/100));
        double amount = principal*(Math.pow(x,timePeriod));
        System.out.println("Maturity Amount = " + amount);
    }
    void recurringDeposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Monthly Installment");
        int principal = sc.nextInt();
        System.out.println("Enter the Rate of Interest");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in months");
        int timePeriod = sc.nextInt();
        
        double amount = (principal*timePeriod) + (principal*timePeriod*(timePeriod+1)*rate)/(2*100*12);
        System.out.println("Maturity Amount = " + amount);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Q4_BoardProgs obj = new Q4_BoardProgs();
        char choice;
        int option;
        
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1 or 2]");
            option = sc.nextInt();
            
            if(option==1)
            {
                obj.termDeposit();
            }
            else if(option==2)
            {
                obj.recurringDeposit();
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
        
    