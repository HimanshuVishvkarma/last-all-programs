import java.util.Scanner;

class ReverseNumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
    
        int reverse = 0;
        while (num>0) {
         int digit = num%10;
         reverse = reverse * 10 + digit;
         num = num/10;
          
          
        }
        System.out.println(reverse);

    }
    
}
