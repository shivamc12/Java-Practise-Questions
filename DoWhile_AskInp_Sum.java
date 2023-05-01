import java.util.*;
public class DoWhile_AskInp_Sum {
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        int num1,num2,sum,check;
        
        do{
        System.out.println("Enter 2 numbers");
        num1=inp.nextInt();
        num2=inp.nextInt();
        
        sum=num1+num2;
        System.out.println("The Sum of 2 numbers are :"+sum);
        System.out.println("To contiue enter any number or To Exit press 0");
        check=inp.nextInt();
        }while(check>0);
        inp.close();
    }
    
}
