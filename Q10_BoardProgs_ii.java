class Q10_BoardProgs_ii
{
    void pattern2()
    {
        for(int i=5; i>0;i--)
        {
            int number=5;
            for(int j=0; j<i; j++)
            {
                System.out.print((number-j)+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Q10_BoardProgs_ii obj = new Q10_BoardProgs_ii();
        obj.pattern2();
    }
}