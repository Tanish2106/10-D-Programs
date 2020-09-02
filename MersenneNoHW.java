class MersenneNoHW
{
    double Number;
    public void Mersenne(int n)
    {
        if(n>=10 && n<=20)
        {
            for(int i = 1; i<=n;i++)
            {
                Number = Math.pow(2,i);
                System.out.println(Number-1);
            }
        }  
    }
}