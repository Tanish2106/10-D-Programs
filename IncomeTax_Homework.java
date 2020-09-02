
public class IncomeTax_Homework
{
    void compute(String name, double income)
    {
        System.out.println("The Name of the employee is " + name);
        if(income<=40000)
        {
            double tax = 0;
            System.out.println("The Income Tax is Rs: " + tax);
        }
        else if(income>=40000 && income<=70000)
        {
            double tax = (income-40000)*20/100;
            System.out.println("The Income Tax is Rs: " + tax);
        }
        else if(income>=70000 && income<=100000)
        {
            double tax = 6000 + (income-70000)*30/100;
            System.out.println("The Income Tax is Rs: " + tax);
        }
        else
        {
            double tax = 6000 + 9000 + (income-100000)*40/100;
            System.out.println("The Income Tax is Rs: " + tax);
        }
    }
}

            