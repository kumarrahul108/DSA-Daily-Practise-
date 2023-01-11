
public class LinkedList 
{  
    static Node head;
    
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

    // insert data 
    public void insert(int data)
    {
        Node n = new Node(data);

        if(head == null)
        {
            head = n;
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
        }
    }


    // traversal 
    public void display()
    {
        // Base Case 
        if(head == null)
        {
            System.out.println("Empty !!");
        }  
        
        Node ptr = head;
        while(ptr != null)
        {
            System.out.print(ptr.data + " -->  "); 
            ptr = ptr.next; 
        }
        System.out.print("null");
    }  


    // Insertation Cases 

    public void addFirst(int data)
    {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(int data)
    {
        Node n = new Node(data);

        // Base Case
        if(head == null)
        {
            head = n;
        } 

        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        } 
        ptr.next = n;
        n.next = null;
    }  


    public void addAfterNode(int data,int node) 
    {
        // Base Case 
        if(node == 0)
        {
            System.out.println("Invalid !!");
        }    

        Node n = new Node(data);

        Node ptr = head;
        while(ptr != null)
        {
            if(ptr.data == node)
            {
                Node curr = ptr;
                n.next = curr.next;
                curr.next = n;
            }   
            ptr = ptr.next;             
        }
    }


    public void addAfterPos(int data,int pos)
    {
        Node n = new Node(data);
        int c=0;

        Node ptr = head;
        while(ptr != null)
        {
            c++;
            if(pos == c) 
            {
                Node curr = ptr;
                n.next = curr.next;
                curr.next = n;
            }
            ptr = ptr.next;
        }
    }


    // Deletion 
    public void deleteFirst()
    {   
        // Base Case 
        if(head == null)
        {
            return;
        }  

        if(head.next == null)
        {
            head = null;
        } 

        head = head.next;
    }


    public void deleteLast()
    {
        // Base Case 
        if(head == null)
        {
            return;
        }  

        if(head.next == null)
        {
            head = null;
        } 

        Node ptr = head;
        while(ptr.next.next != null)
        {
            ptr = ptr.next;
        } 
        ptr.next = null;
    }

    
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();

        list.insert(45);
        list.addFirst(55);
        list.addLast(89);
        list.addAfterNode(77, 55);
        list.addAfterPos(22, 2);

        list.display();

        list.deleteFirst();
        list.deleteLast();

        System.out.println("\n\n"); 
        list.display();
    }    
}
