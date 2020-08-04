import java.util.Scanner;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Base of the Triangle");
        double base = inp.nextDouble();
        System.out.println("Enter the Height of the Triangle");
        double height = inp.nextDouble();
        double area = (base*height)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}