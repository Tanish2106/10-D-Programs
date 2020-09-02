public class Q4
{
    public static void main(char ch, double principal, double rate, int n)
    {
    switch(ch)
    {
        case 'T':
        double x=(1+(rate/100));
        double amt=principal*Math.pow(x,n);
        System.out.println("Amount=" + amt);
        break;
        case 'R':
        double y=principal*n +(principal*n*(n+1))/2.0 * (rate/100.0)*(1/12.0);
        System.out.println("maturity amount=" +y);
        break;
        default:
        System.out.println("Invalid");
        break;
    }
}
}
