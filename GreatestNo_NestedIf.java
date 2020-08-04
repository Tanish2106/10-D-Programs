import java.util.Scanner;
public class GreatestNo_NestedIf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , num3 , Max=0;
        System.out.println("Enter Number 1 : ");
        if(sc.hasNextInt())
        {
            num1 = sc.nextInt();
            System.out.println("Enter Number 2 : ");
            if(sc.hasNextInt())
            {
                num2 = sc.nextInt();
                System.out.println("Enter Number 3 : ");
                if(sc.hasNextInt())
                {
                    num3 = sc.nextInt();
                    if((num1>=0)&&(num2>=0)&&(num3>=0))
                    {
                        Max = num1;
                        if(num2>Max)
                        {
                            Max=num2;
                        }
                        if(num3>Max)
                        {
                            Max=num3;
                        }
                    }
                    else
                    {
                         System.out.println("Zero value not allowed");
                    }    
                    System.out.println("Greatest Number is : " + Max);
                }
                else
                {
                    System.out.println("Non-Integer value entered");
                }
            }
            else
            {
                System.out.println("Non-Integer value entered");
            }
        }
        else
        {
            System.out.println("Non-Integer value entered");
        }
    }
}
                
            
                
       
        
        
        
