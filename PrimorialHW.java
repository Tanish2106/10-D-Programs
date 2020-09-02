class PrimorialHW
{
    int fact=1;
    public int factorial(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                fact = fact * i;
            }
        }
        return fact;
    }
    public int Primorial(int n)
    {
        int count = 0, primorial =1;
        for(int i=1;i<=n;i++)
        {
            if(n%i!=0)
            {
                count++;
            }
            if(count==2)
            {
                primorial = primorial*i;
            }
        }
        return primorial;
    }   
}
              