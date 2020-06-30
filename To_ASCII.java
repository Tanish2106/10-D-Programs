class ToASCII
{
    public void dispASCII()
    {
        char chA='A', chZ='Z', cha='a', chz='z';
        int ascA,ascZ,asca,ascz;
        ascA=(int)chA;
        ascZ=(int)chZ;
        asca=(int)cha;
        ascz=(int)chz;
        System.out.println("The ASCII value of a character A is" + ascA);
        System.out.println("The ASCII value of a character Z is" + ascZ);
        System.out.println("The ASCII value of a character a is" + asca);
        System.out.println("The ASCII value of a character z is" + ascz);
    }
}
public class To_ASCII
{
    public static void main(String args[])
    {
        ToASCII Object1;
        Object1= new ToASCII();
        Object1.dispASCII();
    }
}
        
