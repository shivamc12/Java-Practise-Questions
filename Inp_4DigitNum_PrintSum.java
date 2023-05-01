import java.util.*;
public class Inp_4DigitNum_PrintSum {
    public static void main(String[] args){
        int num,temp,sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a 4 Digit Number :");
        num=inp.nextInt();
        
        for(int i=0;i<=3;i++){
        temp=num%10;
        sum=sum +temp;
        num=num/10;
        }
        System.out.println("The sum of 4 digits is :"+sum);
        
        
        inp.close();
    }
    
}
