import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

class EmployeeDetails {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee details:");
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        System.out.println("Do you want to store employee :");
        System.out.println("Enter Your Name:");
        String Name = input.nextLine();
        if(Num>0){
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
            return;
        }
        while (Num>0) {
            System.out.println("Employee details is :"); 
            System.out.println("Enter Your Name:");
            String Name = input.nextLine();
            System.out.println("Enter Your Age:");
            int Age = input.nextInt();
            System.out.println("Enter Your Address");

            String Add = input.nextLine();
            System.out.println("Enter Your Basic Salary:");
            int B_salary = input.nextInt();
            float HRA = (20*B_salary)/100;
            float Ta = (10*B_salary)/100;
            float Da = Ta;
            float Total = B_salary+HRA+Ta+Da;
            System.out.println(Name);
            System.out.println(Age);
            System.out.println(Add);
            System.out.println("Your HRA is:");
            System.out.println(HRA+"Rs");
            System.out.println("Your TA is:");
            System.out.println(Ta+"Rs");
            System.out.println("Your Da is:");
            System.out.println(Da+"Rs");
            System.out.println("One Employee Talal Salary is =" +Total+"Rs");
        }
     
    }
}
