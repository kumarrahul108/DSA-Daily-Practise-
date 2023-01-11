
public class Array 
{
    // display
    public static void display(int a[],int n)
    {
        for(int i=0;i<n;i++) 
        {
            System.out.print(a[i] + "   ");
        }
    }

    // linear serach 
    public static int linear(int a[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i] == key)
            {
                return i;
            }
        }

        return -1;
    }

    // binary search 
    public static int binary(int a[],int n,int key)
    {
        int low = 0;
        int high = n-1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(a[mid] == key)
            {
                return mid; 
            }

            else if(a[mid] > key)
            {
                high = mid - 1;
            }

            else if(a[mid] < key)
            {
                low = mid + 1;
            }
        }

        return -1;
    }


    // insertation 
    public static void insertation(int a[],int n,int pos,int val)
    {
        int arr[] = new int[n+1];

        for(int i=0;i<arr.length;i++)
        {
            if((pos-1) == i) 
            {
                arr[i] = val;    
            }   
            
            else if((pos-1) > i)
            {
                arr[i] = a[i];
            }

            else if((pos-1) < i) 
            {
                arr[i] = a[i-1];
            }
        }

        display(arr, n+1);
    }


    // deletion  
    public static void delete(int a[],int n,int pos)
    {
        int arr[] = new int[n-1];
        int j=0;

        for(int i=0;i<n;i++)
        {
            if((pos) == i)
            {
                continue;
            }

            arr[j] = a[i];
            j++;
        }

        display(arr, n-1);
    }


    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;  
        display(arr, n);
        System.out.println("\nLinear : " + linear(arr, n, 4));
        System.out.println("\nBinary : " + binary(arr, n, 4));
        System.out.print("\nInsertation : ");
        insertation(arr, n, 3, 33);
        System.out.print("\nDeletion : ");  
        delete(arr, n, 3);      
    }
}