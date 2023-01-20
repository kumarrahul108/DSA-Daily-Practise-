
import java.util.Scanner;

public class P1_Basics 
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter any number :  ");
        int a = sc.nextInt();

        System.out.print("\nInputed Number is : " + a);

        System.out.print("\n\nEnter any number : ");
        boolean b1 = sc.hasNextInt();
        if(b1 == true)
        {
            System.out.println("Yes !!");
        }  
        else 
        {
            System.out.println("No !!"); 
        }
    }

}
