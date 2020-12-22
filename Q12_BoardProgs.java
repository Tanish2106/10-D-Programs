import java.util.Scanner;
class Q12_BoardProgs
{ 
    String[] sArray; 
    Q12_BoardProgs()
    { 
        sArray =new String[20];
    }
    void Input()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 alphabets");
        for(int i=0;i<=sArray.length-1;i++)
        {
          sArray[i]=sc.next();
        }
    }
    void Arrange()
    {  
        String temp;
        for(int i=0; i<=sArray.length-2; i++)
        {
           for(int j=0; j<=sArray.length-2; j++)
           { 
             if(sArray[j].compareTo(sArray[j+1])<0)
             { 
                temp=sArray[j];
                sArray[j]=sArray[j+1];
                sArray[j+1]=temp;
             }
           }
        }   
        for(int i=0;i<=sArray.length-1;i++)
        { 
            System.out.print(sArray[i] +" ");
        }
        System.out.println();
    }
    public static void main()
    {   
        Q12_BoardProgs obj= new Q12_BoardProgs();
        obj.Input();
        obj.Arrange();
    }
}