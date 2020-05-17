public class q4
{
    public static void main(char ch, double p, double r, int n)
    {
    switch(ch)
    {
        case 'T':
        double x=(1+(r/100));
        double amt=p*Math.pow(x,n);
        System.out.println("amount=" + amt);
        break;
        case 'R':
        double y=p*n +(p*n*(n+1))/2.0 * (r/100.0)*(1/12.0);
        System.out.println("maturity amount=" +y);
        break;
        default:
        System.out.println("invalid");
        break;
    }
}
}
        