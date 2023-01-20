
import java.util.*;
public class P3_Conditions 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter age :  ");
        int age = sc.nextInt();

        if(age >= 18 && age <=25)
        {
            System.out.println("Drive a Car");
        } 
        else if(age >25)
        {
            System.out.println("Drive a TRuck !");
        }
        else 
        {
            System.out.println("Not eligible to drive !");
        }

        System.out.println("\n\n");
        
        switch(age)
        {
            case 18:
                System.out.println("Drive a Biker");
                break;

            case 21:
                System.out.println("Drive a Truck");
                break;
                
            default:
                System.out.println("Not Alowed");    
        }

    }    
}
