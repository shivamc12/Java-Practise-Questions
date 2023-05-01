public class Book_Store {
    public static void main(String[] args){
        int cp=1000,sp=100,total;


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
        
    }
}
