public class Pattern_NestedFor6 {
    public static void main(String[]args)
    {
        int i,j,num=1;

        for(i=1;i<5;i++)
        {
            for(j=1;j<i+1;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
    
}
