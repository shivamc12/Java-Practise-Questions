import java.util.*;
class InputTwoNos{
    public static void main(String[] args){
        String name;


        Scanner in=new Scanner(System.in);

        System.out.println("Enter Your Name");
        name=in.nextLine();

        System.out.println("Hello "+name);
        in.close();

    }
}