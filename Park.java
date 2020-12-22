import java.util.Scanner;
class Park
{
    double EntryFee, Discount, Amount;
    int Age;
    Park()
    {
        EntryFee = 0;
        Discount = 0;
        Amount = 0;
        Age = 0;
    }
    void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entry Fee");
        EntryFee = sc.nextDouble();
        System.out.println("Enter the Age");
        Age = sc.nextInt();
    }
    void Calculate()
    {
        if(Age<=12)
        {
            Discount = 45; 
        }
        else if(Age>=50)
        {
            Discount = 50;
        }
        else
        {
            Discount = 10;
        }
        Amount = EntryFee*(1-(Discount/100));
    }
    void Display()
    {
        System.out.println("Entry Fee: " + EntryFee);
        System.out.println("Age: " + Age);
        System.out.println("Discount: " + Discount + "%");
        System.out.println("Amount: " + Amount);
    }
    public static void main()
    {
        Park obj = new Park();
        obj.Input();
        obj.Calculate();
        obj.Display();
    }
}