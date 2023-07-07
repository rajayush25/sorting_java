import java.util.*;
class selectionsort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the elemnts of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j])
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
//  Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:

// One loop to select an element of Array one by one = O(N)
// Another loop to compare that element with every other Array element = O(N)
// Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)

// Auxiliary Space: O(1) as the only extra memory used is for temporary variables while swapping two values in Array. 
// The selection sort never makes more than O(N) swaps and can be useful when the memory write is a costly operation. 