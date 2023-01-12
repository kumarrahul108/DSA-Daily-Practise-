public class Stack_Array 
{
    static int top = -1; 
    static int arr[];
    static int size;  
    
    Stack_Array(int size)
    {
        this.size = size;
        arr = new int[size];
    } 

    // empty 
    public boolean isEmpty()
    {
        if(top < 0)
        {
            return true;
        }
        return false;
    } 

    // full 
    public boolean isFull()
    {
        if((size - 1) == top) 
        {
            return true;
        }
        return false;
    } 

    // display 
    public void display()
    {
        for(int i=top;i >=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    // push 
    public void push(int data)
    { 
        // Base - Case
        if(isFull())
        {
            System.out.println("OverFlow !!");
        }

        top++;
        arr[top] = data;
    }  


    // pop 
    public int pop()
    {
        // Base Case 
        if(isEmpty())
        {
            System.out.println("Empty Stack");  
            return -1;
        }  

        int x = arr[top];
        top--;

        return x;
    }


    public static void main(String[] args) 
    {
        Stack_Array s2 = new Stack_Array(10); 

        s2.push(34);
        s2.push(38);
        s2.push(40);
        s2.push(42);
        s2.push(44);

        s2.display();

        s2.pop();
        System.out.println();

    }    
}
