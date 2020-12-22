public class Q2_BoardProgs
{
    String employee_name; float employee_salary, HRA, total_salary;
    String nameemp(String name)
    {
        employee_name=name;
        return employee_name;
    }
    float salaryemp(float salary)
    {
        employee_salary=salary;
        HRA=50*employee_salary/100;
        total_salary=HRA + employee_salary;
        return total_salary;
    }
    public static void main()
    {
        Q2_BoardProgs obj=new Q2_BoardProgs();
        String x=obj.nameemp("Tanish");
        float y =obj.salaryemp(100000);
        System.out.println("The name of the employee is "+x);
        System.out.println("The salary of the employee is "+y);
    }
}
    
     
        

