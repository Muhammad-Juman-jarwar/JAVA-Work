// A program which shows your stored variable is even/odd number.

import java.util.Scanner;

class lab1_2{
    public static void main(String args []){

        //Getting input from user through Scanner function Available in util package.
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = reader.nextInt();

        //terniary operators using to get the logic of the no if it is even or odd.
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.print(num + " is " + evenOdd);
    }
}