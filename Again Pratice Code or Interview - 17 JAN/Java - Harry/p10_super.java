
class Ek 
{
    int a;

    Ek()
    {
        System.out.println("I am constructor for Class - EK");
    }

    Ek(int a)
    {
        this.a = a;
        System.out.println("I am Constructor of class Ek for setting the value ");
    }  

    public int getA()
    {
        return a;
    }
}

class Do extends Ek 
{   
    int b;  

    Do()
    {
        System.out.println("I am a constructor of Class - Do");
    }

    Do(int b)
    {
        super(67);
        this.b = b;
        System.out.println("I am Constructor of class Ek for setting the value ");    
    }

    public int getB()
    {
        return b;   
    }
}


public class p10_super 
{
    public static void main(String[] args) 
    {
        Do d1 = new Do();
        d1.getA();

        System.out.println("\n");

        Do d2 = new Do(45);
        System.out.println("Value of B : " + d2.getB());
    }
}