import java.util.Scanner;
class Q11_BoardProgs
{
    String[] name;
    int[] RollNo;
    int[] maths;
    int[] phy;
    int[] chem;
    int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        name = new String[n];
        RollNo = new int[n];
        maths = new int[n];
        phy = new int[n];
        chem = new int[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Name of the Student");
            name[i] = sc.next();
            System.out.println("Enter the roll number of the Student");
            RollNo[i] = sc.nextInt();
            System.out.println("Enter the Marks scored in Maths");
            maths[i] = sc.nextInt();
            System.out.println("Enter the Marks scored in Physics");
            phy[i] = sc.nextInt();
            System.out.println("Enter the Marks scored in Chemistry");
            chem[i] = sc.nextInt();
        }
    }
    void calculate()
    {
        int total_marks;
        String remark;
        double average;
        
        for(int i=0;i<n;i++)
        {
            total_marks = maths[i] + phy[i] + chem[i];
            average = total_marks/3;
            
            if(average>=85)
            {
                remark = "EXCELLENT";
            }
            else if(average<85 && average>=75)
            {
                remark = "DISTINCTION";
            }
            else if(average<75 && average>=60)
            {
                remark = "FIRST CLASS";
            }
            else if(average<60 && average>=40)
            {
                remark = "PASS";
            }
            else
            {
                remark = "POOR";
            }
            System.out.println("The Remark of Student" + (i+1) + " is " + remark);
        }
    }
    public static void main()
    {
        Q11_BoardProgs obj = new Q11_BoardProgs();
        obj.input();
        obj.calculate();
    }
}
    