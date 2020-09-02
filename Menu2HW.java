import java.util.Scanner;
class Menu2HW
{
    void generateMenu()
    {
        System.out.println("What would you like to do? ");
        System.out.println("1.Check whether Buzz Number or not");
        System.out.println("2.Find HCF and LCM");
        System.out.println("Enter any number other 1 and 2 to exit");
    }
    void Buzz_No()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%10 == 7 || num/7 ==0)
        {
            System.out.println("The number is a Buzz Number");
        }
        else
        {
            System.out.println("The number is not a Buzz number");
        }
    }
    void HCF_LCM()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        
        int hcf = 1, lcm = 1;
        for(int i = 1;i<=num1;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf = i;
            }
        }
        lcm = num1*num2/hcf;
        
        System.out.println("The HCF is " + hcf);
        System.out.println("The LCM is " + lcm);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Menu2HW obj = new Menu2HW();
        char choice;
        int opt;
        
        do
        {
            obj.generateMenu();
            
            System.out.println("Enter your selection[1 or 2]");
            opt = sc.nextInt();
            
            if(opt==1)
            {
                obj.Buzz_No();
            }
            else if(opt==2)
            {
                obj.HCF_LCM();
            }
            else
            {
                return;
            }
            System.out.println("Enter y to continue and n to exit");
            choice = sc.next().charAt(0);
        }while(choice == 'y');
    }
}