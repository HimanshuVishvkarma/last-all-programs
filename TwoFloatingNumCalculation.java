import java.util.Scanner;

public class TwoFloatingNumCalculation {
    public static void main(String[] args) {
        System.out.println("Floating Number calculator:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Number:");
        double first = input.nextDouble();
        System.out.println("Enter your Second Number: ");
        double second = input.nextDouble();
        System.out.println("Now we are using all operator:");
        double sum = first + second;
        double sub = first - second;
        double mul = first * second;
        double div = first / second;
        double mod = first % second; 
        System.out.println("sum =" +sum);
        System.out.println("sub = "+sub);
        System.out.println("mul = "+mul);
        System.out.println("div = "+div);
        System.out.println("mod = "+mod);
    }
    
}
