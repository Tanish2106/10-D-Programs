class Q5
{
    void info()
    {
        System.out.println("What would you liek to do?");
        System.out.println("Enter 1 to print the triangle of numbers");
        System.out.println("Enter 2 to print the triangle of 5");
    }
    void pattern(int n)
    {
        switch(n)
        {
            case 1:
            String s="";
            for(int i=1;i<=5;i++)
            {
                s=s+i+" ";
                System.out.println(s);
            }
            break;
            case 2:
            for(int i=5;i>0;i--)
            {
                int alphabet=65;
                for(int j=0;j<1;j++)
                {
                    System.out.println((char) (alphabet + j)+ " ");
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Invalid");
        }
    }
    public static void main()
    {
        Q5 obj = new Q5();
        obj.info();
        obj.pattern(1);
    }
}
