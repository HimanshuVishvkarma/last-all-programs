import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Your Year Is a Leap Year:");
        }
        else{
            System.out.println("Your Year is Not a Leap Year:");
        }
    }
    
}
