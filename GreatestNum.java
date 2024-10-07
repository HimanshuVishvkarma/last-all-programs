import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Your Greater Number:");
        System.out.println("Enter Your First Number:");
        int num1 = input.nextInt();
        System.out.println("Enter Your Second Number:");
        int num2 = input.nextInt();
        System.out.println("Enter Your Second Number:");
        int num3 = input.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 +" Is The Greatest Number:");
       }
       else if(num2 >= num3){
        System.out.println(num2 +" Is The Greatest Number:");
       }
       else{
        System.out.println(num3 +" Is The Greatest Number:");
       }
    }
    
}
