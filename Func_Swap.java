import java.util.*;
public class Func_Swap {
    static void Swap(int a,int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[]args)
    {
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter 2 number to Swap");
        a=inp.nextInt();
        b=inp.nextInt();
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        Swap(a,b);
        inp.close();
    }
    
}
