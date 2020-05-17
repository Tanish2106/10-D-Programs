public class q6
{
    public static void main(String s)
    {
        String[]word=s.split(" ");
        String largest=" ";
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()>largest.length())
            {
                largest=word[i];
            }
        }
        System.out.println(largest);
    }
}