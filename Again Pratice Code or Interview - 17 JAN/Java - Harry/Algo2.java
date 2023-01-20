public class Algo2 
{
    // display 
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + "   "); 
        }
    }


    // bubble sort 
    public static void bubble(int a[])
    {
        int n = a.length;

        // passes
        for(int i=0;i<n-1;i++)
        {
            // comparison 
            for(int j=0;j<(n-1-i);j++)
            {
                if(a[j] > a[j+1])
                {
                    // swap 
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
            }
        }
    }


    // selection sort 
    public static void selection(int a[])
    {
        int n = a.length; 

        // passes 
        for(int i=0;i<n-1;i++)
        {
            // minimum 
            int min = i;

            for(int j=i+1;j<n;j++)
            {
                if(a[min] > a[j])
                {
                    min = j;
                }
            }
            
            // swap 
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp; 
        }
    }


    // insertation sort 
    public static void insertation(int a[])
    {
        int n = a.length; 
        
        for(int i=1;i<n-1;i++)
        {
            int j = i-1;
            int curr = a[i];
            while(j>=0 && curr < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr; 
        }
    }   


    // Quick Sort 
    public static void quick(int a[],int low,int high)
    {
        int p_idx = partition(a, low, high);
        if(low <= high)
        {
            quick(a,low,p_idx-1);
            quick(a,p_idx+1,high);
        }
    }

    public static int partition(int a[],int low,int high)
    {
        int pivot = low;
        int i = low + 1;
        int j = high;
        int temp;

        do 
        {
            if(a[i] <= pivot)
            {
                i++;
            }    

            if(a[j] >= pivot)
            {
                j--;
            }

            if(i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;  
            }
        }
        while(i < j); 

        // swap the pivot 
        temp = a[low];
        a[low] = a[j];
        a[j] = temp; 

        return j;

    }


    public static void main(String[] args) 
    {
        int arr[] = {45,23,78,12,67};  
        
        display(arr);
        System.out.println();

        System.out.print("\nBubble Sort : ");
        bubble(arr);
        display(arr);

        System.out.print("\nSelection Sort :  "); 
        selection(arr);
        display(arr);

        System.out.print("\nInsertation Sort : ");
        insertation(arr);
        display(arr); 

        System.out.print("\nQuick Sort : ");
        quick(arr, 0 ,arr.length-1); 
        display(arr);
    }    
}
