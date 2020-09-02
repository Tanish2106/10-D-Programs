import java.util.Scanner;
class MovieMagic
{
    int year;
    String title;
    float rating;
    public MovieMagic()
    {
        year = 0;
        title = "";
        rating = (float)0.0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year of release of the Movie");
        year = sc.nextInt();
        System.out.println("Enter Title of the movie");
        title = sc.next();
        System.out.println("Enter the Rating of the Movie");
        rating = sc.nextFloat();
    }
    void display()
    {
        System.out.println("The Title of the Movie is " + title);
        if(rating>=0.0 && rating<=2.0)
        {
            System.out.println("Rating:Flop");
        }
        else if(rating>2.0 && rating<=3.4)
        {
            System.out.println("Rating:Semi-Hit");
        }
        else if(rating>3.4 && rating<=4.5)
        {
            System.out.println("Rating:Hit");
        }
        else if(rating>4.5 && rating<=5.0)
        {
            System.out.println("Rating:Super-Hit");
        }
    }
    public static void main()
    {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}
    