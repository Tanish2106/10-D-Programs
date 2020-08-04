import java.util.Scanner;
class VolumeOfSphere
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = inp.nextDouble();
        double volume = (4*22*radius*radius*radius)/3*7;
        System.out.println("Volume of Sphere is: " + volume);
    }
}