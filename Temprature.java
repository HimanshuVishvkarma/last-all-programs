import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Today Tamprature is:");
        float F = input.nextFloat();
        float C = (F-32)*5/9;
        System.out.println(+C  + "Celsius");
    }
    
}
 