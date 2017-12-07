class QuickSort
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    int partition(int arr[], int low, int high)
    {
        int i = low-1;
        int j = low;
        int pivot = high;
        int temp = 0;
        while(j<high){
            if(arr[j] < arr[pivot]){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
   
   return i;  
    }
    
    
/* 
   The main function that implements QuickSort() (present in a class 
   different from GfG)
   arr[] --> Array to be sorted,   low  --> Starting index,  high  --> Ending index 
*/
static void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        GfG g = new GfG();
        int pi = g.partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    } 
}
}
