import java.util.Scanner;
class Scan 
{
    void inputScan()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the input");
        
        int num = sc.nextInt();
        String str = sc.next();
        
        System.out.println("The number entered is : " + num);
        System.out.println("The string entered is : " + str);
        
    }
}