class Cube1
{
    int length;
    int breadth;
    int height;
    public int getVolume()
    {
        return ( length*breadth*height);
    }
    Cube1( int l, int b, int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    Cube1( int l, int b)
    {
        this( l,b,l);
    }
    Cube1()
    {
        length=5;
        breadth=5;
        height=5;
    }
}
public class ImplementCube
{
    public static void main( String args[])
    {
        Cube1 Obj1 = new Cube1();
        System.out.println("Volume of Cube1 is :"+ Obj1.getVolume());
        Cube1 Obj2 = new Cube1(1,2,3);
        System.out.println("Volume of Cube2 is :" + Obj2.getVolume());
        Cube1 Obj3 = new Cube1(3,5);
        System.out.println("Volume of Cube3 is :" + Obj3.getVolume());
    }
}