import java.util.Scanner;

public class ChechNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Your Number Nigative/Positive:");
        System.out.println("Please Enter your Number:");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Your Number is Positive:");
        }
        else if(num==0){
            System.out.println("Your Number is Zero:");
        }else{
            System.out.println("Your Number is Nigative:");
        }
    }
    
}
