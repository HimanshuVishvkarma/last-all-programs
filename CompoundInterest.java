import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("COMPOUND INTEREST");
        float P = input.nextFloat();
        float R = input.nextFloat();
        float t = input.nextFloat();
        float q1 = (1+R/100);
        float q2 = P*t;
        float Rate = q1*q2;
        System.out.println("Compound Interest is ::" +Rate+"Rs");


    }
    
}
