public class TelegramCharges_Homework
{
    void compute( int no_of_words )
    {
        if(no_of_words>0 && no_of_words<=15)
        {
            int telegram_charge = 5;
            System.out.println("The Telegram Charge is Rs: " + telegram_charge);
        }
        else if(no_of_words>15)
        {
            int telegram_charge = 5 + (no_of_words-15)*1;
            System.out.println("The Telegram Charge is Rs: " + telegram_charge);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
            
            