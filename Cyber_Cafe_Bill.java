import java.util.Scanner;
class Cyber_Cafe_Bill
{
    double bill;
    int usage;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        int mins = 0;
        
        System.out.println("Enter the Internet usage ( in mins ) :" );
        mins = sc.nextInt();
        
        usage = mins;
    }
    void generateBill()
    {
        if( usage>=0 &&  usage<=60 )
        {
            bill=20;
        }
        else if( usage>60 && usage<=90 )
        {
            bill=20+12;
        }
        else if( usage>90 && usage<=105 )
        {
            bill=20+12+8;
        }
        else
        {
            bill=20+12+8+ ( usage-105 )*2;
        }
        System.out.println("The bill is Rs: " + bill);
    }
    public static void main()
    {
        Cyber_Cafe_Bill obj = new Cyber_Cafe_Bill ();
        obj.getData();
        obj.generateBill();
    }
}
        
        
        