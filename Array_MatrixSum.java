public class Array_MatrixSum {
    public static void main(String[]args)
    {
        int[][] arr1={{1,2,3},{4,5,6}};
        int[][] arr2={{1,2,3},{3,4,5}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1[i][j]+arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    
}
