//Create a Restaurant menu in switch where if we select any option the program should show the price of that food item
package Lab2_Tasks;

import java.util.Scanner;

class lab2_6 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to BhartiyaTasteBuds.com");
        System.out.println();

        while(true){
        System.out.println("To order South Indian Dish, Enter 1");
        System.out.println("To order North Indian Dish, Enter 2");
        System.out.println("To order Rajasthani Dish, Enter 3");
        System.out.println("To order Gujrati Dish, Enter 4");
        System.out.println("To order Bengali Dish, Enter 5");
        System.out.println("To order Desserts, Enter 6");
        System.out.println("To Exit, Enter 9");

        System.out.println();
        System.out.println("Enter your choice::");
        int choice = scan.nextInt();

        switch(choice){
        case 1: System.out.println("Welcome to South Indian Food Court \nYour Bill Would be 120$");
        break;

        case 2: System.out.println("Welcome to North Indian Food Court \nYour Bill Would be 180$");
        break;

        case 3: System.out.println("Welcome to Rajasthani Food Court \nYour Bill Would be 320$");
        break;

        case 4: System.out.println("Welcome to Gujrati Food Court \nYour Bill Would be 140$");
        break;

        case 5: System.out.println("Welcome to Bengali Food Court \nYour Bill Would be 100$");
        break;   

        case 6: System.out.println("Welcome to Desserts Food Court \nYour Bill Would be 78$");
        break;

        case 9: System.out.println("Thanks for Coming to our Hotel. \nHope you Enjoyed. Visit again");
        System.exit(0);
        break;

        default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
        }
        }
    }

}