class LeapYear
{
    public static void main(String args[])
    {
        System.out.println("Leap years between 2020 and 2040");
        int i;
        for(i=2000;i<=2040;i++)
        {
            if(i%4==0)
            {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}