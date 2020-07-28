public class P7_Homework_Commission
{
    void compute(double sales)
    {
        if(sales>0 && sales<10000)
        {
            double commission = sales*5/100;
            System.out.println("The Commission of the salesman is " + commission);
        }
        else if(sales>=10000 && sales<=50000)
        {
            double commission = sales*8/100;
            System.out.println("The Commission of the salesman is " + commission); 
        }
        else if(sales>50000)
        {
            double commission = sales*10/100;
            System.out.println("The Commission of the salesman is " + commission); 
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}

    
    
    
    