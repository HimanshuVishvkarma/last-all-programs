import java.util.Scanner;

public class TwoNumOperator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Two inputs:");

        int a = input.nextInt();
        int b = input.nextInt();
        int p,q,r,s,t;
        p = a+b;
        q = a-b;
        r = a*b;
        s = a/b;
        t = a%b;
        System.out.print( +p);
        System.out.print("\t"+q);
        System.out.print("\t"+r);
        System.out.print("\t"+s);
        System.out.print("\t"+t);



    }
}