//Create a Restaurant menu in switch where if we select any option the program should show the price of that food item
package Lab2_Tasks;

import java.util.Scanner;

class lab2_6 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to BhartiyaTasteBuds.com");
        System.out.println();

        while(true){
        System.out.println("To order sindhi food, Enter 1");
        System.out.println("To order Baloachi food, Enter 2");
        System.out.println("To order Pakhtoon food, Enter 3");
        System.out.println("To order Punjaabi food, Enter 4");
        System.out.println("To order All foods together, Enter 5");
        System.out.println("To order Sweets, Enter 6");
        System.out.println("To Exit, Enter 9");

        System.out.println();
        System.out.println("Enter your choice::");
        int choice = scan.nextInt();

        switch(choice){
        case 1: System.out.println("Welcome to Sindhi Food Court \nYour Bill Would be 120$");
        break;

        case 2: System.out.println("Welcome to Baloachi Food Court \nYour Bill Would be 180$");
        break;

        case 3: System.out.println("Welcome to Pakhtoon Food Court \nYour Bill Would be 320$");
        break;

        case 4: System.out.println("Welcome to Punjaabi Food Court \nYour Bill Would be 140$");
        break;

        case 5: System.out.println("Welcome to All Together Food Court \nYour Bill Would be 100$");
        break;   

        case 6: System.out.println("Welcome to Sweets Food Court \nYour Bill Would be 78$");
        break;

        case 9: System.out.println("Thanks for Coming to our Hotel. \nHope you Enjoyed. Visit again");
        System.exit(0);
        break;

        default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
        }
        }
    }

}