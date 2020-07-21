public class reverse_triangle
{
   public void prin()
   {
       int i,j;
       for(i=8;i>0;i-=2)
       {
           for(j=2;j<=i;j+=2)
           {
               System.out.println(j+" ");
            }
           System.out.println();
        }
    }
}