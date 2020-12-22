import java.util.Scanner;
class sArray
{
    int temporary,size;
    int[] sArray;
    void initialise()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements");
        size=sc.nextInt();
        sArray=new int[size];
    }
    void input()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the "+ size +" numbers");
       for(int i=0;i<size;i++) 
       {
           sArray[i]=sc.nextInt();  
       }
    }
    void calc()
    {
       for(int i=0;i<sArray.length-1;i++) 
       {                                           
           if(i%2==0) 
           {
               temporary=sArray[i];
               sArray[i]=sArray[i+1];
               sArray[i+1]=temporary;
           }
       }
       System.out.println("The Order of Elements after swapping: ");
       for(int i=0;i<sArray.length;i++)
       {
           System.out.print(sArray[i]+", ");   
       }
     }
    public static void main()
    {
        sArray obj = new sArray();
        obj.initialise();
        obj.input();
        obj.calc();
    }
}