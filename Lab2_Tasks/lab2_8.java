//Create a simple Calculation Program where a user is asked for x and y values for addition, Subtraction, Multiplication and division.
package Lab2_Tasks;

import java.util.Scanner;

public class lab2_8 {

    public static void main(String[] args){

        int a,b,c;
        int choice;
        Scanner input = new Scanner(System.in);
        while(true) {

            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Quit the program\n \n ");

            System.out.print("Make your choice: ");
            choice = input.nextInt();

            switch (choice) {

                //First Case for Addition
                case 1:
                    System.out.print("Enter the first number: ");
                    a = input.nextInt();
                    System.out.print("Enter the second number: ");
                    b = input.nextInt();
                    c = a + b;
                    System.out.println("The sum of the numbers is = " + c +"\n");
                    break;

                //Second case for Substraction
                case 2:
                    System.out.println("Enter the first number ");
                    a = input.nextInt();
                    System.out.println("Enter the second number");
                    b = input.nextInt();
                    c = a - b;
                    System.out.println("The difference of the numbers is = " + c +"\n");
                    break;

                //Third case for Multiplication
                case 3:
                    System.out.println("Enter the first number");
                    a = input.nextInt();
                    System.out.println("Enter the second number");
                    b = input.nextInt();
                    c = a * b;
                    System.out.println("The product of the numbers is = " + c + "\n");
                    break;

                //Fourth case for Division
                case 4:
                    System.out.println("Enter the first number");
                    a = input.nextInt();
                    System.out.println("Enter the second number");
                    b = input.nextInt();
                    c = a / b;
                    System.out.println("The quotient is = " + c +"\n");
                    break;

                //Fifth case to quit the program
                case 5:
                    System.exit(0);


                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
    }
}