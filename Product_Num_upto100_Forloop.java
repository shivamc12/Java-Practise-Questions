public class Product_Num_upto100_Forloop {
    public static void main(String[]args)
    {
        long temp=1;

        for(int i=1;i<=10;i++)
        {
            temp=temp*i;
        }
        System.out.println("The product of numbers 1-100 is : "+temp);
    }
    
}
