public class Q1_BoardProgs 
{
    void floydTriangle()
    {
        for(int i=1;i<=10;i++)
        {
            if((i!=1)&&(i!=3)&&(i!=6))
            {
                System.out.print(i +" ");
            }
            else
            {
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String args[])
    {
        Q1_BoardProgs obj = new Q1_BoardProgs();
        obj.floydTriangle();
    }
}
           
