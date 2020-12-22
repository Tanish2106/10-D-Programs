import java.util.Scanner;
class Q13_BoardPrograms
{
    String[]city;
    float[]temp;
    void input()
    {
        city = new String[5];
        temp = new float[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter City " + (i+1) + " name");
            city[i] = sc.next();
            System.out.println("Enter City " + (i+1) + " temperature");
            temp[i] = sc.nextFloat();
        }
    }
    void compute()
    {
        float tmp;
        String s;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(temp[j]>temp[j+1])
                {
                    tmp=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=tmp;
                    s=city[j];
                    city[j]=city[j+1];
                    city[j+1]=s;
                }
            }
        }
        System.out.println("Records in ascending order of temperature-");
        for(int i=0;i<=4;i++)
        {
            System.out.println(city[i]+"-"+temp[i]);
        }
    }
    public static void main()
    {
        Q13_BoardPrograms obj = new Q13_BoardPrograms();
        obj.input();
        obj.compute();
    }
}
        
                    
                        