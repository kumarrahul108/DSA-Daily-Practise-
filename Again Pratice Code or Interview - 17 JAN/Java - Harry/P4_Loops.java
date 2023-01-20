public class P4_Loops 
{
    public static void main(String[] args) 
    {
        for(int a =1;a<=10;a++)
        {
            if(a == 7)
            {
                break;
            }
            System.out.print(a + "  ");
        }     

        System.out.println("\n\n");


        int i = 0; 
        while(i <= 10)
        {
            i += 1;
            if(i == 6)
            {
                continue;
            }
            System.out.print(i + "  ");
            
        }  

        System.out.println("\n");


        int j =1;
        do 
        {
            System.out.print(j + " ");
            j++;
        }
        while(j !=11);
    }    
}
