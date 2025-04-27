import java.util.*;
public class basicsort {
    public static void bubblesort(int arr[])
    {   
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++){
                // ascending sorting
                // if(arr[j]>arr[j+1])
                // descending sorting

                if(arr[j]<arr[j+1])

                {
                //swaap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                // ascending sorting

                // if(arr[j] < arr[minPos])
                // descending sorting
                
                if(arr[j] > arr[minPos])

                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }
    public static  void InsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
                // ascending sorting

            // while(prev>=0 && curr < arr[prev])
             // descending sorting
            while(prev>=0 && curr > arr[prev])

            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev+1]=curr;
        }
    }
    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
         // ascending sorting
         // for(int i=0;i<count.length;i++)
         // descending sorting

        for(int i=count.length-1;i>=0;i--)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(stringprob args[])
    {
        // int arr[]={5,4,1,3,2};
        int arr[]={1,4,3,1,2,5,3,4};

        // bubblesort(arr);
        // Selectionsort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        printArr(arr);

    } 
    
}
