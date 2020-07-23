public class CyberCafe_Bill
{
    double bill;
    
    public void generateBill(int usage)
    {
        if( usage >0 && usage <=60 ) 
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
            bill=20+12+8+(usage-105)*2;
        }
        System.out.println("The Bill is Rs :" + bill);
    }
    public static void main(String args[])
    {
        CyberCafe_Bill obj = new CyberCafe_Bill();
        
        obj.generateBill(50);
    }
}
    