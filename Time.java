class Time
{
int hrs;
int mins;

void input(int h, int m)
{
    hrs=h;
    mins=m;
}
void addTime(Time obj1, Time obj2)
{
    int totalmins=obj1.hrs*60 + obj1.mins + obj2.hrs*60 + obj2.mins;
    hrs=totalmins/60;mins=totalmins%60;
}
void display()
{
    System.out.println("Total time="+hrs+"hrs"+mins+"mins");
}
public static void main()
{
    Time t1=new Time();
    Time t2=new Time();
      Time t3=new Time();
    
    t1.input(2,50);//non-interactive input
    t2.input(3,50);//non-interactive input
    t3.addTime(t1,t2);
    t3.display();
}
}
    
    


  
















