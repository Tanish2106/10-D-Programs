import java.util.Scanner;
class AreaofCircle
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = inp.nextDouble();
        double area = (22*radius*radius)/7;
        System.out.println("Area of Circle is: " + area);
    }
}