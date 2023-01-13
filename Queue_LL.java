
public class Queue_LL 
{
    static Node front;
    static Node back;

    static class Node 
    {   
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;    
        }
    }  


    // empty queue
    public boolean isEmpty()
    {
        if(front == null)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }  

    // en-queue
    public void insert(int data)
    {
        Node n = new Node(data);

        // Base Case
        if(isEmpty())
        {
            front = n;
            back = n;
        }

        back.next = n;
        back = n; 
    }

    // de-queue
    public int remove()
    {
        // Base Case
        if(isEmpty())
        {
            System.out.println("Underflow !!");
        }  

        if(front.next ==null)
        {
            front = back = null;
            return front.data;
        }  

        else 
        {
            int x = front.data;
            front = front.next;
            return x; 
        }
    }

    // display queue
    public void display()
    {
       // Base Case 
       if(isEmpty())
       {
           System.out.println("Empty");
       }       

       Node ptr = front;
       while(ptr != null) 
        {
            System.out.println(ptr.data);
            ptr = ptr.next;  
        }    
    }


    public static void main(String[] args) 
    {
        Queue_LL q1 = new Queue_LL();

        q1.insert(67);
        q1.insert(68);
        q1.insert(69);
        q1.insert(70);

        q1.display();

        q1.remove();

        System.out.println();  
        q1.display();
    }    
}
