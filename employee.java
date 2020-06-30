public class employee
{
    int pan; String name; double taxincome; double tax;
    void input(int private_acc_no, String n, double tax_income)
    {
        pan=private_acc_no; name=n; taxincome=tax_income;
    }
    void calc()
    {
        if(taxincome<=100000)
        {
            tax=0;
        }
        else if(taxincome>=100001 && taxincome<=150000)
        {
            tax=((taxincome-100000)*10)/100.0;
        }
        else if(taxincome>=150001 && taxincome<=250000)
        {
            tax= 5000+((taxincome-150000)*20)/100.0;
        }
        else if(taxincome>250000)
        {
            tax=25000+((taxincome-250000)*30)/100.0;
        }
    } 
    void display()
    {
        System.out.println("Pan number \tName \tTax-income \tTax");
        System.out.println(  pan+ " \t" +  name+ " \t" +taxincome+ "\t"+tax);
    }
    public static void main(String args[])
    {
        employee obj=new employee();
        obj.input(2567,"Mark",250000);
        obj.calc();
        obj.display();
    }
}
