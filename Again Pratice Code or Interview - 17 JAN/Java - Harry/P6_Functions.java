
public class P6_Functions 
{
    public static int sum(int a,int b)
    {
        return a + b;
    }

    public int summ(int a,int b)
    {
        return a + b;        
    } 

    public static int suum(int ...var)
    {
        int res = 0;
        for(int a:var)
        {
            res += a;
        }
        return res;
    }   

    public static void greet()
    {
        System.out.println("Good Morning !!");
    } 

    public static void greet(String s)
    {
        System.out.println("Good Morning : " + s);
    }


    public static void main(String[] args) 
    {
        int c = sum(5, 7);
        System.out.println("Sum : " + c); 

        P6_Functions obj = new P6_Functions();
        int d = obj.sum(5,6);  
        System.out.println("Sum object creation :  " + d);

        int e = suum(2,2,2,2,2);
        System.out.println("Sum Variable Arguments : " + e);

        System.out.println("\n");
        greet();
        greet("Rahul"); 
    }    
}
