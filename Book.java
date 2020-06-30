public class Book
{
    private String code;
    private String title;
    private double price;
    public Book(String bookCode, String t, double pr)
    {
        code=bookCode;
        title=t;
        price=pr;
    }
    public String getCode()
    {
        return code;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
}
