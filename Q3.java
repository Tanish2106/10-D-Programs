import java.util.Random;
public class Q3
{
    public static void main(String args[])
    {
        Random rand=new Random();
        for(int i=1;i<=20;i++)
        {
           int rand_int1=rand.nextInt(100);
           System.out.println( rand_int1);
        }
    }
}
        