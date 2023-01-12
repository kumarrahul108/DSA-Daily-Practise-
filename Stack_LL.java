
public class Stack_LL 
{
    static Node top;

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

    // empty stack 
    public boolean isEmpty()
    {
        if(top == null)
        {
            return true; 
        } 
        else 
        {
            return false;
        }
    }  

    // push stack 
    public void push(int data)
    {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    // display stack 
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty stack!!");
        } 

        Node ptr = top;
        while(ptr != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    // pop 
    public void pop()
    {
        // Base Case 
        if(isEmpty())
        {
            System.out.println("Empty Stack !!");
        }

        System.out.print(top.data + " ");
        top = top.next;
    }

    // peak 
    public int peek()
    {
         // Base Case 
         if(isEmpty())
         {
             System.out.println("Empty Stack !!");
         }

         return top.data;  
    }



    public static void main(String[] args) 
    {
        Stack_LL s1 = new Stack_LL();

        s1.push(67);
        s1.push(45);
        s1.push(89);
        s1.push(23); 

        s1.display();
    }    
}
