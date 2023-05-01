public class Else_if_Logical_Gate {
    public static void main(String[]args)
    {
        int a=100,b=100,c=5,d=12;

        if((a>b)&&(a>c)&&(a>d))
        {
            System.out.println(" A is Greater");
        }
        else if((b>a)&&(b>c)&&(b>d))
        {
            System.out.println("B is Greater");
        }
        else if((c>a)&&(c>c)&&(c>b))
        {
            System.out.println("C is Greater");
        }
        else if((d>a)&&(d>b)&&(d>c))
        {
            System.out.println("D is Greater");
        }
        else
        {
            System.out.println("Two or more numbers are equal");
        }        
    }
    
}
