import java.util.*;
public class Switch_Case {
    public static void main(String[]args)
    {
        int num;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the Day Number");
        num=inp.nextInt();

        switch(num)
        {   
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid Day Please enter a number between 1-7");
            break;
                
        }
        inp.close();
    }
    
}
