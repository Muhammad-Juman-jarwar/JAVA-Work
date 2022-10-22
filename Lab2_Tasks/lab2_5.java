//Create a login interface where userinputs its email and password to redirect on welcome screen. (Note: where at least 5 users should be registered so we can compare their emails and passwords, user details must be stored in multidimensional arrays)

package Lab2_Tasks;

import java.lang.reflect.Array;
import java.util.Scanner;

class lab2_5 {
    public static void main(String args[])
    {
        String username, password;

        String[][] arr = {{"Muhammad_Juman","Awais","Ranveer","Ahmar","Sarfaraz"},{"jarwar","pitafi","singh","hakro","malik"}};

        Scanner s = new Scanner(System.in);
        System.out.print("Enter username: ");//username: Muhammad_Juman
        username = s.nextLine();
        System.out.print("Enter password: ");//password:jarwar
        password = s.nextLine();
        if(username.equals(arr[0][0]) && password.equals(arr[1][0]))
        {
            System.out.println("Authentication Successful \nWelcome Mr. Muhammad_Juman");
        }
        else if(username.equals(arr[0][1]) && password.equals(arr[1][1])){
            System.out.println("Authentication Successful \nWelcome Mr. Awais");
        }
        else if(username.equals(arr[0][2]) && password.equals(arr[1][2])){
            System.out.println("Authentication Successful \nWelcome Mr. Ranveer");
        }
        else if(username.equals(arr[0][3]) && password.equals(arr[1][3])){
            System.out.println("Authentication Successful \nWelcome Mr. Ahmar");
        }
        else if(username.equals(arr[0][4]) && password.equals(arr[1][4])){
            System.out.println("Authentication Successful \nWelcome Mr. Sarfaraz");
        }
        else 
        {
            System.out.println("Authentication Failed \nYour Login Details Did Not Matched");
        }
    }
}
