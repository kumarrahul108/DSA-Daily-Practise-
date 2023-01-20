
import java.util.Scanner;

public class P13_Errors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = 67;
        int b = 7;

        try 
        {
            int c = a/b;
            System.out.println("Division : " + c);
        }
        catch(Exception e)
        {
            System.out.println("Failed Program ");
            System.out.println(e); 
        }

        finally 
        {
            System.out.println("Thanks for visistin our Website");
        } 

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;  
        
        while(true)
        {
            System.out.println("Enyer any Index : ");
            int idx = sc.nextInt();

            try 
            {
                System.out.println(arr[idx]);
                
                try 
                {
                    System.out.println("Welcome to nested");
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Sorry !!");
                }
            }
            catch(Exception e)
            {
                System.out.println("Error : " + e);
            }
        }
        
    }    
}
