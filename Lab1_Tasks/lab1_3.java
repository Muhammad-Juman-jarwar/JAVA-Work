//Create a program using every single operator we have learned till now.

import java.util.Scanner;

class lab1_3{
    public static void main(String[] args) {

        char operator;
        int number1, number2, number3, number4, number5, result;

        // creating Scanner function for input
        Scanner input = new Scanner(System.in);

        // Now Time for User number inputs
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        // Now asking user for the arithmetic operation
        System.out.println("Choose an operator: +, -, *, %, or /");
        operator = input.next().charAt(0);

        switch (operator) {

        // Addition logic
        case '+':
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;

        // subtraction logic
        case '-':
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;

        // multiplication logic
        case '*':
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;

        // division logic
        case '/':
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;

        // Modulus logic
        case '%':
            result = number1 % number2;
            System.out.println(number1 + " % " + number2 + " = " + result);
            break;

        default:
            System.out.println("You have Chosen wrong/inValid operator!");
            break;
        }


//All Conditional operators have an equal value is always boolean or true or false


        // creating Scanner function for input of conditional operators
        Scanner input2 = new Scanner(System.in);

        // Now Time for User number inputs
        System.out.print("Enter third number: ");
        number3 = input2.nextInt();

        System.out.print("Enter Fourth number: ");
        number4 = input2.nextInt();

        System.out.println( 
            " (number3 < number4) = " + (number3 < number4) + 
            " (number3 > number4) = " + (number3 > number4) + 
            " (number3 <= number4) = " + (number3 <= number4) +  
            " (number3 >= number4) = " + (number3 >= number4) + 
            " (number3 == number4) = " + (number3 == number4) + 
            " (number3 != number4) = " + (number3 != number4) 
            );

//All logical operators are used downward and mostly used in if else conditions

        //creating Scanner function for input of Logical operators
        Scanner input3 = new Scanner(System.in);

        // Now Time for User number inputs
        System.out.print("Enter Fifth number: ");
        number5 = input3.nextInt();

        if(number5 <= 15 && number5 >= 8){
            System.out.println("&& is logical Operator and called as and and");
        }else if(number5 <= 15 || number5 >= 8){
            System.out.println("|| is logical operator and called as or or ");
        }else{
            System.out.println("Just Wanted to show the Usage of logical operators");
        }

    }
}