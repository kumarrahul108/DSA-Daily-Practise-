
import java.util.Scanner;
public class P2_Strings 
{
    public static void main(String[] args) 
    {
        String name = new String("Rahul Aryan");
        System.out.println("String :  " + name);   

        String s = "Mohan Das";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Movcie Name :  ");
        String str = sc.nextLine(); 

        System.out.print("Length : " + str.length());  

        String s1 = s.toLowerCase();
        System.out.println("\n" + s1);
            
        String s2 = s.toUpperCase();
        System.out.println(s2);

        char c = s.charAt(2);
        
    }    
}
