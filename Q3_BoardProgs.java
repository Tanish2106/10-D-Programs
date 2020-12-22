import java.util.Random;
public class Q3_BoardProgs
{
    void random_numbers()
    {
        Random rand=new Random();
        for(int i=1;i<=20;i++)
        {
           int rand_no=rand.nextInt(100);
           System.out.println( rand_no);
        }
    }
    public static void main(String args[])
    {
        Q3_BoardProgs obj = new Q3_BoardProgs();
        obj.random_numbers();
    }
}
        