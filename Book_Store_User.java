import java.util.*;
public class Book_Store_User {
    public static void main(String[] args){
        float cp,sp,total;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the Cost Price");
        cp=inp.nextFloat();
        System.out.println("Enter the Selling Price");
        sp=inp.nextFloat();

        if(cp<sp)
        {
            total=sp-cp;
            System.out.println("The net profit is "+total);
        }
        else if(cp==sp)
        {
            System.out.println("There is no profit and loss");
        }
        else
        {
            total=cp-sp;
            System.out.println("The net loss is "+total);
        }
        inp.close();
   }
}
