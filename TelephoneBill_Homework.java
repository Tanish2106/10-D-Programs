public class TelephoneBill_Homework
{
    void compute(int n_o_c) // n_o_c refers to number of calls
    {
        if(n_o_c>0 && n_o_c<=100)
        {
            double telephone_bill = 100;
            System.out.println("The Telephone Bill is Rs: " + telephone_bill);
        }
        else if(n_o_c>100 && n_o_c<=150)
        {
            double telephone_bill = 100 + (n_o_c-100)*2;
            System.out.println("The Telephone Bill is Rs: " + telephone_bill);
        }
        else if(n_o_c>150)
        {
            double telephone_bill = 100 + 100 + (n_o_c-150)*2.50;
            System.out.println("The Telephone Bill is Rs: " + telephone_bill);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}

            