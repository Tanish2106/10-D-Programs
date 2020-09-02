import java.util.Scanner;
class Mobike
{
    int bno,pho,days,charge;
    String name;
    Mobike()
    {
        bno=0;
        pho=0;
        days=0;
        charge=0;
        name="";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Customer");
        name = sc.next();
        System.out.println("Enter the Bike's Number");
        bno = sc.nextInt();
        System.out.println("Enter the Phone Number of the Customer");
        pho = sc.nextInt();
        System.out.println("Enter the number of days the bike is taken on rent");
        days = sc.nextInt();
    }
    void compute()
    {
        if(days<=5)
        {
            charge = 500*days;
        }
        else if(days>5 && days<=10)
        {
            charge = 2500 + (days-5)*400;  
        }
        else if(days>10)
        {
            charge = 2500 + 2000 + (days-10)*200;
        }
    }
    void display()
    {
        System.out.println("The Name of the Customer is " + name);
        System.out.println("The Bike's Number is " + bno);
        System.out.println("The Phone Number of the Customer is " + pho);
        System.out.println("The Bike is taken on rent for " + days + " days");
        System.out.println("The Rental Charge is " + charge);
    }
    public static void main()
    {
        Mobike obj = new Mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}