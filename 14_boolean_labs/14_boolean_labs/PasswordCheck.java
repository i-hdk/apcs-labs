//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
    private String password;

    public PasswordCheck()
    {
        password = "baka";
    }

    public void check()
    {
        Scanner keyboard = new Scanner(System.in);
        String i;
        do{
            System.out.print("Enter the password:: ");
            i = keyboard.next();
            if(i.equals(password)){
                System.out.print("VALID");
            }
            else{
                System.out.println("INVALID");
            }
        }
        while(!i.equals(password));
    }
}