import java.util.*;
public class Inp_4DigitNum_Reverse {
    public static void main(String[] args){
        int num,temp,sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a 4 Digit Number :");
        num=inp.nextInt();
        
        for(int i=0;i<=3;i++){
        temp=num%10;
        sum=sum*10 +temp;
        num=num/10;
        }
        System.out.println(sum);
        
        
        inp.close();
    }
    
}
