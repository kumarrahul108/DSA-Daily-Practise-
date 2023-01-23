
import java.util.Random;
import java.util.Scanner;

public class Project_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); 

        int comp = r.nextInt(3); 

        System.out.print("\nEnter : \n0 for Rock \n1 for Papers \n2 for Scissors"); 
        int user = sc.nextInt(); 

        if(user == comp)
        {
            System.out.println("Match Tie"); 
        }

        else if(user == 0)
        {
            if(comp == 1)
            {
                System.out.println("Lost");
            }  
            if(comp == 2)
            {
                System.out.println("Won");
            }  
        } 

        else if(user == 1)
        {
            if(comp == 2)
            {
                System.out.println("Lost"); 
            }
            if(comp == 0)
            {
                System.out.println("Won"); 
            }
        } 

        else 
        {
            if(comp == 0)
            {
                System.out.println("Lost"); 
            }
            if(comp == 1)
            {
                System.out.println("Won");
            }
        }

        System.out.println("Computer Choose : " + comp);
        System.out.println("User Choose : " + user); 

    }    
}
