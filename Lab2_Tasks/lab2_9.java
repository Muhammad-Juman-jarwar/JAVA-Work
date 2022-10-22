//Print a Fibonacci Series (0,1,1,2,3,5,8,13,21,34,55,89,...)
package Lab2_Tasks;

import java.util.Scanner;

class lab2_9{
    public static void main(String[] args) {
    int fibo1st=0,fibo2nd=1,i,nth,next;

    Scanner input = new Scanner(System.in);

    // Now Time for User number inputs
    System.out.print("Please Enter no of \"How Many\" terms of fibonacci series you want to print: ");
    nth = input.nextInt();

    next=fibo1st+fibo2nd;

    System.out.println("The Fibonacci Series till \"" + nth + "\" Terms is as under");

    System.out.println(fibo1st);
    System.out.println(fibo2nd);

    for( i=3 ; i<nth ; i++ ) 
    {
        System.out.println(next);
        fibo1st=fibo2nd;
        fibo2nd=next;
        next=fibo1st+fibo2nd;
    }
    }
}
