import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Marks = input.nextInt();
        if(Marks >= 90 ){
        System.out.println("A+ Grade");
    }else if(Marks >= 75){
        System.out.println("A Grade");
    }else if(Marks >= 60){
        System.out.println("B Grade");
    }else if(Marks >= 50){
        System.out.println("C Grade");
    }else if(Marks >= 34){
        System.out.println("D Grade");
    }else{
        System.out.println("Fail");
    }
    }
    
}
