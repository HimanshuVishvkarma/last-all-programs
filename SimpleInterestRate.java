import java.util.Scanner;

public class SimpleInterestRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Is:");
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        float Rate = (P*T*R)/100;
        System.out.println("INTERST = "+Rate);
    }
    
}
