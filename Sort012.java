/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sort012 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0;test<testCases;test++) {
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];
            String tempArr[] = br.readLine().split(" ");
            for(int i=0;i<size;i++){
                arr[i] = Integer.parseInt(tempArr[i]);
            }
            int low = 0;
            int mid = 0;
            int high = size - 1;
            int temp;
            while(mid <= high) {
                switch(arr[mid]) {
                    case 0:
                        temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;
                        mid++;
                        break;
                    case 1:
                        mid++;
                        break;
                    case 2:
                        temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                        high--;
                        break;
                }
            }
            for(int k=0;k<size;k++)
                System.out.print(arr[k]+" ");
            System.out.println();
        }
        
	}
}
