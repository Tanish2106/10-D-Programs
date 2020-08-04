import java.util.Scanner;
class VolumeOfCylinder
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = inp.nextDouble();
        System.out.println("Enter the Height");
        double height = inp.nextDouble();
        double volume = (22*radius*radius*height)/7;
        System.out.println("Volume of Cylinder is: " + volume);
    }
}
