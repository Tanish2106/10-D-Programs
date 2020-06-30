public class student
{
    String name; int age,m1,m2,m3,maximum; double average;
    student(String Name,int Age, int Marks1, int Marks2, int Marks3)
    {
    }
    student()
    {
    }
    void accept( String Name, int Age, int Marks1, int Marks2, int Marks3)
    {
        name=Name;
        age=Age;
        m1=Marks1;
        m2=Marks2;
        m3=Marks3;
    }
    void calc()
    {
        average=(m1+m2+m3)/3.0;
        maximum=(m1>m2 && m1>m3)?m1:(m2>m1 && m2>m3)?m2:m3;
    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Marks1="+m1);
        System.out.println("Marks2="+m2);
        System.out.println("Marks3="+m3);
        System.out.println("Average="+average);
        System.out.println("Maximum marks="+maximum);
    }
    public static void main(String args[])
    {
        student obj1= new student("Jake", 15, 75,90,99);
        student obj2= new student();
        obj2.accept("Jake", 15, 75,90,99);
        obj2.calc();
        obj2.display();
    }
}
        