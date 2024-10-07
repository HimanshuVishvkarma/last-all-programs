import java.util.Scanner;

public class MultipTable {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int Multy = input.nextInt();
     int i = 1;
     while (i<=10) {
       
        int Multiplication = Multy*i;
        System.out.println( Multiplication);
        i++;
        
     }
    }
}