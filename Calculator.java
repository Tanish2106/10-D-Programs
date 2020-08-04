import java.util.Scanner;
public class Calculator
{
    int No1, No2, No3;
    char ch;
    void Add()
    {
        No3 = No1 + No2;
        System.out.println("The Sum is: " + No3);
    }
    void Sub()
    {
        No3 = No1-No2;
        System.out.println("The Difference is: " + No3);
    }
    void Mult()
    {
        No3 = No1*No2;
        System.out.println("The Product is: " + No3);
    }
    void Div()
    {
        No3 = No1/No2;
        System.out.println("The Quotient is: " + No3);
    }
    public static void main()
    {
        Calculator obj = new Calculator();
        System.out.println("Enter the first number");
        Scanner Calculator = new Scanner(System.in);
        obj.No1 = Calculator.nextInt();
        System.out.println("Enter the second number");
        obj.No2 = Calculator.nextInt();
        System.out.println("Enter a character based on the operation to be carried out");
        char ch = Calculator.next().charAt(0);
        
        if(ch == '+')
        {
            obj.Add();
        }
        else if(ch == '-')
        {
            obj.Sub();
        }
        else if(ch == '*')
        {
            obj.Mult();
        }
        else if(ch == '/')
        {
            obj.Div();
        }
        else
        {
            System.out.println("Wrong Character Entered");
        }
    }
}