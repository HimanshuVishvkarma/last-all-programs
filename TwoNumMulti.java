import java.util.Scanner;

public class TwoNumMulti {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter our First Number:");
        int n1 = sn.nextInt();
        System.out.println("Enter your Scoand Number:");
        int n2 = sn.nextInt();
        int multi = n1*n2;
        System.out.println("Answer = ");
        System.out.println(multi);
    }
    
}
