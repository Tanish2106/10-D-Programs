public class Q8
{
    void check(String str, char ch)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
            System.out.print("The number of "+ch);
            System.out.println(" present is " + count);
     }
    void check(String s1)
    {
        s1=s1.toLowerCase();
        char[]vowels={'a', 'e', 'i', 'o', 'u'};
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<vowels.length;j++)
            {
                if(s1.charAt(i)==vowels[j])
                {
                    System.out.print(vowels[j]);
                }
            }
        }
    }
}
                
