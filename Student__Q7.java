public class Student__Q7
{
    String name;
    int Roll_no;
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    double sub5;
    double avg;
    void allotment(double maths, double phy, double chem, double bio, double comp)
    {
        sub1=maths;
        sub2=phy;
        sub3=chem;
        sub4=bio;
        sub5=comp;
        avg=(sub1+sub2+sub3+sub4+sub5)/5;
        if(avg>=90)
        {
            System.out.println("Science with computers");
        }
        else if((avg>=80)&&(avg<90))
        {
            System.out.println("Science without computers");
        }
        else if((avg>=70)&&(avg<80))
        {
            System.out.println("Commerce with maths");
        }
        else if((avg>=60)&&(avg<70))
        {
            System.out.println("Commerce without maths");
        }
        else
        {
            System.out.println("No Stream");
        }
    }
}
    