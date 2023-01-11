
public class CircularList 
{
    static Node head;
    static Node tail;
    
    // node class  
    static class Node 
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            this.next = null;  
        }
    }

    // traversal 
    public void display()
    {
        Node ptr = head;
        do 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        while(ptr != head); 
    }

    // isnertattion 
    public void insert(int data)
    {
        Node n = new Node(data);

        if(head == null)
        {
            head = n;
            tail = n;
            tail.next = head;
        } 

        else 
        {
            tail.next = n;
            tail = n;
            tail.next = head; 
        }
    }

    // Cases :

    public void addFirst(int data)
    {
        Node n = new Node(data);  

        tail.next = n;
        n.next = head;
        head = n; 
    }

    public void addLast(int data)
    {
        Node n = new Node(data);

        tail.next = n;
        tail = n;
        tail.next = head;
    }

    public void addAfterValue(int data,int val)
    {
        Node ptr = head;
        do 
        {
            if(ptr.data == val)
            {
                Node n = new Node(data);
                n.next = ptr.next;
                ptr.next = n;        
            }
            ptr = ptr.next;
        }
        while(ptr != head);     
    } 


    // Delete 
    public void remove(int val)
    {
        Node ptr = head;
        Node prev = null; 

        while(ptr.data != val)
        {
            prev = ptr;
            ptr = ptr.next;
        } 

        prev.next = ptr.next;
    } 


    public static void main(String[] args) 
    {
        CircularList lt = new CircularList();

        lt.insert(55);
        lt.addFirst(44);
        lt.addLast(88);
        lt.addAfterValue(99, 44);

        lt.display();

        lt.remove(88);
        System.out.println();
        lt.display();  
    }    
}
