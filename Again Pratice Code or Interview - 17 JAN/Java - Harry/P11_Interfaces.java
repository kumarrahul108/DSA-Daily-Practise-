
// package inter;


abstract class Parent 
{
    public void greet2()
    {
        System.out.println("Good Morning , Rahul");
    }

    abstract public void sayHello();
    abstract public void greet(); 
}

class Child extends Parent 
{
    @Override
    public void sayHello()
    {
        System.out.println("Hello , Rahul");
    }

    @Override
    public void greet()
    {
        System.out.println("Good Afternoon , Rahul"); 
    }
}

// interfaces 

interface Car 
{
    public void horn();
    public void music();
}  

interface Speed 
{
    public void applyBrake();
}  

class Maruti implements Car,Speed
{
    @Override
    public void horn()
    {
        System.out.println("Main hoon Na ...pee ..peee");
    }

    @Override
    public void music()
    {
        System.out.println("knock knock tera baap aaya ..");
    }

    @Override
    public void applyBrake()
    {
        System.out.println("Switch to Gear 4");
    }  

}



public class P11_Interfaces 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.greet();
        c.greet2();

        /* 

        Parent p = new Parent();
        p.greet2();

        Abstract class object can't be Created !!  

        */ 
        System.out.println("\n"); 

        Maruti m = new Maruti();

        m.applyBrake();
        m.music();
        m.horn();
        

    }    
}
