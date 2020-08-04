public class RandomNumbers
{
    public static void main(String args[])
    {
        System.out.println("Random Numbers between 1 and 100 are, ");
        for(int i=0;i<5;i++)
        {
            System.out.println("Random Number["+(i+1)+"]:"+(int)(Math.random()*100));
        }
    }
}

        