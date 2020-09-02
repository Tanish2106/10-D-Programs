import java.util.Scanner;
class Menu3HW
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1.Calculate Area of Circle");
        System.out.println("2.Calculate Area of Square");
        System.out.println("3.Calculate Area of Rectangle");
        System.out.println("Enter a number other 1,2 and 3 to exit");
    }
    void Circle_Area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("The area of the circle is " + area);
    }
    void Square_Area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side");
        int side = sc.nextInt();
        double area = side*side;
        System.out.println("The area of the square is " + area);
    }
    void Rectangle_Area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        double area = length*breadth;
        System.out.println("The are of the rectangle is " + area);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Menu3HW obj = new Menu3HW();
        char choice;
        int opt;
        
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1,2,3]");
            opt = sc.nextInt();
            
            if(opt == 1)
            {
                obj.Circle_Area();
            }
            else if(opt == 2)
            {
                obj.Square_Area();
            }
            else if(opt == 3)
            {
                obj.Rectangle_Area();
            }
            else
            {
                return;
            }
            
            System.out.println("Enter y to continue and n to exit");
            choice = sc.next().charAt(0);
            
        }while(choice == 'y');
    }
}