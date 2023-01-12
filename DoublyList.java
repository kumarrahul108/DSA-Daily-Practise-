
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
        System.out.print("null");     
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
        else 
        {
            Node ptr = head;
            while(ptr.next != null)
            {
                ptr = ptr.next;
            }
            ptr.next = n;
            n.next = null;
            tail = n;
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


    public void addLast(int data)
    {
        Node n = new Node(data);

        if(head == null)
        {
            head = n;
            tail = n; 
        }

        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        } 
        ptr.next = n;
        n.next = null;
        tail = n;

    }  


    public void remove(int data)
    {
        Node ptr = head;
        Node prev = null;
        while(ptr.data != data)
        {
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = ptr.next;
    }


    

    public static void main(String[] args) 
    {
        DoublyList list = new DoublyList();

        list.insert(66);
        list.addFirst(56);
        list.addLast(88);
        list.insert(73);
        list.addFirst(23);

        list.display();

        list.remove(66); 
        System.out.println("\n");
        list.display();
    }    
}
