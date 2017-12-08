class MergeSort
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        int size1 = m - l + 1;
        int size2 = r - m;
        int a = 0;
        int b = 0;
        int k = l;
        
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        //System.out.print("\nArray1 of size "+size1+" is : ");
        for(int i = 0;i<size1;i++){
            arr1[i] = arr[i+l];
            //System.out.print(arr1[i]+" ");
        }
        //System.out.print("\nArray2 of size "+size2+" is : ");
        for(int j = 0;j<size2;j++){
            arr2[j] = arr[j+m+1];
            //System.out.print(arr2[j]+" ");
        }
        //System.out.println("\nMerged Array is : ");
        while(a < size1 && b < size2){
            if(arr1[a] <= arr2[b]){
                arr[k] = arr1[a];
                a++;
                k++;
            } else {
                arr[k] = arr2[b];
                b++;
                k++;
            }
            //System.out.print(arr[k-1]+" ");
        }
        
        while(a<size1){
            arr[k] = arr1[a];
            a++;
            k++;
        }
        
        while(b<size2){
            arr[k] = arr2[b];
            b++;
            k++;
        }
    }
    
 /* This method is present in a class other than GfG class . */
static void mergeSort(int arr[], int l, int r)
 {
    MergeSort g = new MergeSort();
    if (l < r)   
   {
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr , m+1, r);
        g.merge(arr, l, m, r);
    }
}
}
