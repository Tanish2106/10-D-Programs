import java.util.Scanner;
class AreaOfRectangle
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Length");
        double length = inp.nextDouble();
        System.out.println("Enter the breadth");
        double breadth = inp.nextDouble();
        double area = length*breadth;
        System.out.println("Area of Rectangle is: " + area);
    }
}