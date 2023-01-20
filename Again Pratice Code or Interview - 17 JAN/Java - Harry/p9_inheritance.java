
class Base 
{  
    int x;

    public void setX(int x)
    {
        this.x = x;  
    }  

    public int getX()
    {
        return x; 
    }  

    public void greet()
    {
        System.out.println("Good Morning !!"); 
    }
}


class Derived extends Base 
{
    int y;

    public void setY(int y)
    {
        this.y = y;
    } 

    public int getY()
    {
        return y;
    }

    @Override
    public void greet()
    {
        System.out.println("Good Afternoon !!");
    }
}

public class p9_inheritance 
{
    public static void main(String[] args) 
    {
        Base b = new Base();
        b.setX(6);
        b.greet();
        System.out.println("Value of X :" + b.getX()); 

        System.out.println("\n");

        Derived d = new Derived();
        d.setX(7);
        d.setY(8);
        d.greet();
        System.out.println("Value of X :" + d.getX());
        System.out.println("Value of Y :" + d.getY());

        System.out.println("\n"); 
        
        Base bb = new Derived();  
        bb.setX(78);
        System.out.println("Value of X : " + bb.getX());



    }    
}
