
import java.util.Scanner; 

public class Project_1  
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        String name;
        System.out.println("Enter Your NAme :  ");
        name = sc.nextLine();

        int arr[] = new int[5]; 
        int sum = 0;

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = sum/5; 
        
        System.out.println("\n Percentage : " + avg); 

    }
}