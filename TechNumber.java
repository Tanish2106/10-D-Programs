public class TechNumber
{
    public static void main(String args[])
    {
        int fh,sh,sum_sqr;
        System.out.println("4-digit tech numbers are:");
        for(int i=1000;i<=9999;i++)
        {
            fh=i/100;
            sh=i%100;
            sum_sqr=(int)Math.pow((fh+sh),2);
            if(sum_sqr==i)
            {
                System.out.println(i+"");
            }
        }
    }
}