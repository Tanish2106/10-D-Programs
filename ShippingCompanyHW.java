public class ShippingCompanyHW
{
    double TotalCost;
    void compute(int units , char c)
    {
        
        if(c=='y' || c=='Y' || c=='n' || c=='N')
        {
            double discount = TotalCost*10/100;
            TotalCost = TotalCost - discount;
            System.out.println("Discount is " + discount);
            System.out.println("The Total Cost is " + TotalCost);
        }
        else
        {
            if(units<15)
            {
                TotalCost = units*150;
            }
            else if(units>15 && units<=20)
            {
                TotalCost = 15*150 + (units-15)*145;
            }
            else if(units>20 && units<=30)
            {
                TotalCost = 15*150 + 5*145 + (units-20)*140;
            }
            else if(units>30 && units<=50)
            {
                TotalCost = 15*150 + 5*145 + 10*140 + (units-30)*135;
            }
            else if(units>50)
            {
                TotalCost = 15*150 + 5*145 + 10*140 + 20*135 + (units-50)*130;
            }
        }
        System.out.println("Discount is 0");
        System.out.println("The Total Cost is " + TotalCost);
    }
}
        
        
        
    
            
            
            
        
    
            
        
        
