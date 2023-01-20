
class MyThread1 extends Thread 
{
    MyThread1(String name)
    {
        super(name);   
    }     

    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("Cooking Thread");
            i++;  
        }
    }
}  

class MyThread2 implements Runnable 
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("Listining Music");
            i++;
        }
    }
}

class MyThread3 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<25)
        {
            System.out.println("Methods in Thread...");
            try 
            {
                Thread.sleep(400);
            }
            catch(Exception e) 
            {
                System.out.println(e); 
            }
            i++;
        }       
    }
}

class MyThread4 implements Runnable
{
    public void run()
    {
        int i=1;
        while(i<25)
        {
            System.out.println("I am Thread 4 of the Process ");
            try 
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e); 
            }
            i++; 
        }
    }
}



public class P12_Threading 
{
    public static void main(String[] args) 
    {
        // extending hread class 
        MyThread1 t1 = new MyThread1("Rahul"); 
        t1.start();

        // implementing runnable interface 
        MyThread2 t2 = new MyThread2();
        Thread tt2 = new Thread(t2);
        tt2.start();


        MyThread3 t3 = new MyThread3();
        // t3.start();

        System.out.println("Name of the Thread : " + t1.getName()); 

        MyThread4 t4 = new MyThread4();
        Thread tt4 = new Thread(t4);
        // tt4.start();

        t3.start();
        try 
        {
            tt4.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        tt4.start();
        




    }       
}
