
// Algorithms in Java 

public class Algorithms 
{   
    public static void display(int a[]) 
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + "  ");
        } 
    }


    // Bubble sort -> swap at each step 
    public static void bubble(int a[])
    {
        int n = a.length;
        
        // no of passes 
        for(int i=0;i<n-1;i++)
        {
            // no of comparison 
            for(int j=0;j<(n-1-i);j++)
            {
                // comparison
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


    // Selection Sort --> choose min & compare & finally swap the values 
    public static void selection(int a[])
    {
        int n = a.length;

        // no of passes 
        for(int i=0;i<n-1;i++)
        {
            int min = i;

            for(int j =i+1;j<n-1;j++)
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



    // Insertation Sort -> 
    public static void insertation(int a[])
    {
        int n = a.length;

        // no of comparison 
        for(int i=1;i<n-1;i++)
        {   
            int j = i-1;   // index to store the sorted array last index
            
            while(a[i]<a[j]  && j>=0)  // comparison between 
            {
                a[j+1] = a[j];  
                j--; 
            }
            // update the value of the array 
            a[j+1] = a[i];
        }
    }



    // Quick Sort --> choose a pivot element & then make a counter of i & j & swap the element 
    public static void quick(int a[],int low,int high)
    {
        if(low <= high)
        {
            int pidx = partition(a,low,high);  // partition index 
        
            quick(a, low, pidx-1); 
            quick(a, pidx+1, high); 
        }
    }

    public static int partition(int a[],int low,int high)
    {
        int pivot = a[low];  // choose 1st element as pivot  

        int i = low + 1;  // counter for i -> initial se 
        int j = high;   // counter for j -> back se 
        int temp;   // to store temporary variable 

        do 
        {
            // increase index of i to get element greater than pivot 
            if(a[i] <= pivot)
            {
                i++;
            }

            // decrease index of j to get element lesser than pivot
            if(a[j] >= pivot)   
            {
                j--;
            } 

            // check whether index of i is less than j or not reached j 
            if(i < j)  
            {
                // swap the elemnets present at index i and index j
                temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
            } 
        }
        while(i < j);

        // swap with pivot elements with final position of jth element 
        temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;  // pivot index 
    }


    // Merge Sort 
    public static void merge(int a[])
    {
        int n = a.length; 
    }
    

    public static void main(String[] args) 
    {
        int arr[] = {3,7,12,67,23,18};  
        System.out.print("\nArray Elemnets  : ");
        display(arr);   

        bubble(arr);
        System.out.print("\nBubble Sort     : "); 
        display(arr);

        selection(arr);
        System.out.print("\nSelection Sort : ");
        display(arr); 

        insertation(arr); 
        System.out.print("\nInsertion Sort : ");
        display(arr); 

        quick(arr, 0, arr.length - 1);
        System.out.print("\nQuick Sort : ");
        display(arr); 

    }
}