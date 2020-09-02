import java.util.Scanner;
class Menu
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate Volume of Sphere");
        System.out.println("2. Calculate Volume of Cylinder");
        System.out.println("3. Calculate Volume of Cone");
        System.out.println("Enter your selection [1,2 or 3]");
        System.out.println("Press any integer other than 1,2 and 3 to exit");
    }
    void calcSphereVolume()
    {
        Scanner sc = new Scanner(System.in);
        double volume;
        int radius;
        System.out.println("Enter the Radius");
        radius = sc.nextInt();
        volume = (4/3)*(3.14)*radius*radius*radius;
        System.out.println("The Volume is : " + volume);
    }
    void calcCylinderVolume()
    {
        Scanner sc = new Scanner(System.in);
        double volume;
        int radius;
        int height;
        System.out.println("Enter the radius");
        radius = sc.nextInt();
        System.out.println("Enter the height");
        height = sc.nextInt();
        volume = 4*3.14*radius*radius*height/3;
        System.out.println("The volume is : " + volume);
    }
    void calcConeVolume()
    {
        Scanner sc = new Scanner(System.in);
        double volume;
        int radius;
        int height;
        System.out.println("Enter the radius");
        radius = sc.nextInt();
        System.out.println("Enter the height");
        height = sc.nextInt();
        volume = 3.14*radius*radius*height/3;
        System.out.println("The volume is : " + volume);
    }
    public static void main()
    {
        Menu obj = new Menu();
        char choice;
        int opt;
        
        do
        {
            Scanner sc = new Scanner(System.in);
            obj.generateMenu();
            System.out.println("Enter your selection");
            opt = sc.nextInt();
            
            if(opt==1)
            {
                obj.calcSphereVolume();
            }
            else if(opt==2)
            {
                obj.calcCylinderVolume();
            }
            else if(opt==3)
            {
                obj.calcConeVolume();
            }
            else
            {
                return;
            }
            
            System.out.println("Would you like to continue[y for yes/n for no]");
            choice = sc.next().charAt(0);
            
        }while(choice == 'y');
    }
}
        