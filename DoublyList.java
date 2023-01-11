
public class DoublyList 
{
    static Node head;
    static Node tail;

    // node class  
    static class Node 
    {
        Node prev;
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;  
        }
    }  


    // Traversal 
    public void display()
    {
        // Base class
        if(head == null)
        {
            System.out.println("Empty !!");
        } 

        Node ptr = head;
        while(ptr != null)
        {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }       
    }  


    // Insertation 
    public void insert(int data) 
    {
        Node n = new Node(data);
        
        // Base case 
        if(head == null) 
        {
            head = n;
            tail = n;
            n.prev = null;
            n.next = null;
        }
    }  

    // cases 
    public void addFirst(int data) 
    {
        Node n = new Node(data);

        // Base case 
        if(head == null) 
        {
            head = n;
            tail = n;   
        }

        n.next = head;
        n.prev = null;
        head = n;
    } 

    

    public static void main(String[] args) 
    {

    }    
}
