import java.util.*;
public class Factorial {
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        int num,temp=1;
        System.out.println("Enter a number for which you would like to find the factorial");
        num=inp.nextInt();

        for(int i=num;i>=1;i--)
        {
            temp=temp*i;
        }
        System.out.println(temp);
    }
    
}
