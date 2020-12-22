class Q10_BoardProgs_i
{
    void pattern1()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i);
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                   System.out.print(" # ");
                }
                else 
                {
                   System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main()
    {
        Q10_BoardProgs_i obj = new Q10_BoardProgs_i();
        obj.pattern1();
    }
}
    