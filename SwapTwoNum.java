import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        System.out.println("Welcome Two Number Swapping:\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number a:");
        int a = sc.nextInt();
        System.out.println("Enter your Number b;");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping is Complete:");
        System.out.println("Now......a = " +a);
        System.out.println("Now......b = "+b);

    }
    
}
