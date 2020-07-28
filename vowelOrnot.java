public class vowelOrnot
{
    void checkVowel(char ch)
    {
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("It is a vowel");
            break;
            default:
            System.out.println("It is not a vowel");
            break;
        }
    }
}
    