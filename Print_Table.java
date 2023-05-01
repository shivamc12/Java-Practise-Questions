import java.util.*;
public class Print_Table {
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        int num;

        System.out.println("Enter the number for which you would like to print the table");
        num=inp.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
        inp.close();
    }
    
}
