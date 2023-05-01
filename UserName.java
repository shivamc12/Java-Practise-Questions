import java.util.*;
public class UserName {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int num1,num2,add;
        System.out.println("Enter the 2 number which you would like to add");
        num1=in.nextInt();
        num2=in.nextInt();
        add=num1+num2;

        System.out.println("The addition of two numbers are : "+add);
        in.close();
    }
}
