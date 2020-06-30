//program to convert distance in feet or inches using a call by reference method
public class Try
{
    private static float feet;
    private static int inches;
    static String convertedTo;
    
    public Try()
    {
        feet=0;
        inches=0;
        convertedTo= "empty";
    }
    public Try(float f, int i)
    {
        feet=f;
        inches=i;
        convertedTo="Not changed yet";
    }
    public static float convertToFeet(Try obj)
    {
        int y=obj.inches;
        float f=y;
        int fts=y/12;
        int ins=(int)(f-fts*12);
        f=fts;
        f+=(float)ins/10;
        convertedTo="feet";
        return f;
    }
    public static int convertToInches(Try obj)
    {
        int i;
        int fts=(int)obj.feet;
        int ins =obj.inches;
        convertedTo="inches";
        i=fts*12+ins;
        return i;
    }
    public String Distance()
    {
        String distance=(int)feet+"\'"+inches+"\'";
        return distance;
    }
    public void TryTest()
    {
        Try objForFeet=new Try(5,2);
        System.out.println("Distance" + objForFeet.Distance()+"is equal to" + convertToInches(objForFeet)+""+convertedTo);
        Try objForInches= new Try(0,16);
        System.out.println("Distance" + objForInches.Distance()+"is equal to" + convertToFeet(objForInches)+""+convertedTo);
    }
}