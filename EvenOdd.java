import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Even Odd Calculator:");
        System.out.println("Enter your Number:");
        int num = input.nextInt();
        if(num % 2 == 0){
        System.out.println("Your Number is Enven:");
        }
        else{
            System.out.println("Your Number is Odd:");
        }
    }
    
}
