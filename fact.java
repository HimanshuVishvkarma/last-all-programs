import java.util.Scanner;

class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        if (num==0) {
            System.out.println("1");
            }
            int Fact = 1;
         while (i<=num) {
          
            Fact = Fact*i;
         
            i++;
         }
         System.out.println(Fact);
    }
    
}
