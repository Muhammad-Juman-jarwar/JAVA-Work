import java.util.*;

public class Calculator1 {
    public static void main(String[] args) {
        while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first number: ");
                double a = sc.nextDouble();
                System.out.println("Enter the Second number: ");
                double b = sc.nextDouble();
                System.out.println("Enter the operation: ");
                System.out.println("if you want to add press 1");
                System.out.println("if you want to subtract press 2");
                System.out.println("if you want to multiply press 3");
                System.out.println("if you want to divide press 4");
                int operation = sc.nextInt();
                switch (operation) {
                    case 1:
                        System.out.println(a + b);
                        break;
                    case 2:
                        System.out.println(a - b);
                        break;
                    case 3:
                        System.out.println(a * b);
                        break;
                    case 4:
                        System.out.println(a / b);
                        break;
                    default:
                        System.out.println("Please enter a valid operation");
                }
                System.out.println("Do you want to continue? Press Y for yes and N for no");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("N")) {
                    System.exit(0);
                }

        }        
    }
}