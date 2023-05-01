import java.util.*;
public class Print_Product_Superset {

    public static void main(String[]args)
    {
        int num1,num2,temp;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter 2 number");
        num1=inp.nextInt();
        num2=inp.nextInt();
        temp=num1;

        if(num2==0)
        {
            System.out.println("1");
        }
        else if(num2==1)
        {
            System.out.println(num1);
        }
        else
        {
            for(int i=1;i<num2;i++)
            {
             num1=num1*temp;

            }
            System.out.println(num1);
        }
        inp.close();
    }
    
}
