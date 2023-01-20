
import java.util.*;
public class p5_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[5];

        int arr2[];
        arr2 = new int[6];

        int arr3[] = {1,2,3,4,5}; 

        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i] + "  ");  
        }  

        System.out.println("\n\n");  

        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = sc.nextInt();
        }  

        System.out.println("\n"); 

        for(int a:arr3)
        {
            System.out.println(a);
        }

        
        System.out.println("2 D Matrix :  "); 
        int a[][] = new int[3][3];

        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n\n");
        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println(); 
        }

    }    
}
