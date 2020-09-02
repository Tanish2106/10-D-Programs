import java.util.Scanner;
class ParkingLotHW
{
    int vno,hours;
    double bill;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vehicle Number");
        vno = sc.nextInt();
        System.out.println("Enter the Number of hours the vehicle is parked in the Parking Lot");
        hours = sc.nextInt();
    }
    void calculate()
    {
        if(hours==1)
        {
            bill=3;
        }
        else if(hours>1)
        {
            bill = 3 + (hours-1)*1.5;
        }

    }
    void display()
    {
        System.out.println("The Vehicle Number is " + vno);
        System.out.println("The Number of hours spent is " + hours);
        System.out.println("The Bill is Rs: "+ bill);
    }
     public static void main()
    {
        ParkingLotHW obj = new ParkingLotHW();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

            
