import java.util.*;
public class Func_TablePrint {
    static void table(int a)
    {
        int prod;
        for(int i=1;i<=10;i++)
        {
            prod=a*i;
            System.out.println(a+" * "+i+" =" +prod);
        }
    }
    static void main(String[]args)
    {
        int num;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number which you would like to print the table");
        num=inp.nextInt();
        table(num);
        inp.close();
    }
    
}
