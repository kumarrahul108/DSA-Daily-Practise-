

class NegativeException extends Exception 
{
    @Override
    public String toString()
    {
        return "Radius can't be Negative"; 
    } 

    @Override
    public String getMessage()
    {
        return "Radius can't be Negative";
    }
}


public class P14_Throw 
{
    public static int divide(int a,int b) throws ArithmeticException   
    {
        int c = a/b;
        return c;
    }

    public static double area(int r) throws NegativeException
    {
        if(r<0)
        {
            throw new NegativeException();
        }
        double rs = Math.PI * r * r;

        return rs;
    } 

    public static void main(String[] args) 
    {
        try 
        {
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception "); 
        }
    }    
}
