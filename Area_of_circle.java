public class Area_of_circle
{
    public static void main(String args[])
    {
        int radius;
        double area;
        radius = Integer.parseInt(args[0]);
        area = 3.14159*(radius*radius);
        System.out.println("A circle of radius" + args[0] + "has an area of" + area);
    }
}