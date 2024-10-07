import java.util.Scanner;

public class AreaOfTrienle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Area Of Triangle");
        float B = input.nextFloat();
        float H = input.nextFloat();
        float Area = B*H;
        System.out.println("Triangle Area is: " +(Area/2)+"cm2");

    }
    
}
