import java.util.*;
class insertionsort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String args[]){
    int j=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    System.out.println("Enter the elements of the Array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
        int key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    printArray(arr);
}
}

// Time Complexity of Insertion Sort

// The worst case time complexity of Insertion sort is O(N^2)
// The average case time complexity of Insertion sort is O(N^2)
// The time complexity of the best case is O(N).

// Space Complexity of Insertion Sort
// The space complexity is O(1).
// The auxiliary space complexity of Insertion Sort’s Recursive Approach is O(n) due to the recursion stack.