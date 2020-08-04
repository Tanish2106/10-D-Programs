import java.util.Scanner;
class Zodiac
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Zodiac Sign: ");
        String zodiac = scanner.next();
        scanner.nextLine();
        System.out.println("Enter your Weight(in kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your Lucky Number: ");
        int luckyNum = scanner.nextInt();
        System.out.println("Hello, " + name + ".");
        System.out.println("Your Lucky Number is " + luckyNum + ".");
        System.out.println("You weigh " + weight + "kg.");
        System.out.println("Your Zodiac Sign is " + zodiac + ".");
    }
}
 