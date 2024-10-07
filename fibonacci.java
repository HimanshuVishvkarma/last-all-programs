import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int first = 0, second = 1;
        if(num<0)return;
        if(num==0)return;{
            System.out.print("0 1 ");
         }
        while (first+second<num) {
            int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
            
        }
    }
    
}
