public class BookStore
{
    public static void main(String args[])
    {
        Book book1=new Book("Java", "Understanding Java", 180.00);
        Book book2=new Book("Python","Undrestanding Python",200.00);
        Book book3=new Book("C++","Understanding C++",300.00);
        System.out.println("Book 1 Details");
        System.out.println("Code:"+book1.getCode()+ ",Title:"+book1.getTitle() +",Price :"+book1.getPrice());
        System.out.println("Book 2 Details");
        System.out.println("Code:"+book2.getCode()+ ",Title:"+book2.getTitle() +",Price :"+book2.getPrice());
        System.out.println("Book 3 Details");
        System.out.println("Code:"+book3.getCode()+ ",Title:"+book3.getTitle() +",Price :"+book3.getPrice());
        
    }
}

