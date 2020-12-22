import java.util.Scanner;
class TravelPlan
{
    private long PlanCode;
    private String Place;
    private int Number_of_travellers;
    private int Number_of_buses;
    
    public TravelPlan()
    {
        PlanCode = 1001;
        Place = "Agra";
        Number_of_travellers = 5;
        Number_of_buses = 1;
    }
    void NewPlan()
    {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the Plan Code");
        PlanCode = sc.nextLong();
        System.out.println("Enter the Name of the Place");
        Place = sc.next();
        System.out.println("Enter the Number of Travellers");
        Number_of_travellers = sc.nextInt();
        
        if(Number_of_travellers<20)
        {
            Number_of_buses = 1;
        }
        else if(Number_of_travellers>=20 && Number_of_travellers<40)
        {
            Number_of_buses = 2;
        }
        else
        {
            Number_of_buses = 3;
        }
    }
    void ShowPlan()
    {
        System.out.println("Plan Code: " + PlanCode);
        System.out.println("Place: " + Place);
        System.out.println("Number of Travellers: " + Number_of_travellers);
        System.out.println("Number of Buses: " + Number_of_buses);
    }
    public static void main()
    {
        TravelPlan obj = new TravelPlan();
        obj.NewPlan();
        obj.ShowPlan();
    }
}
       
        