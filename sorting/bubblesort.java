import java.util.*;
class bubblesort{
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the Array");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the elemnts of Array");
		 for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		 }
		// int arr[]={1,8,4,9,3,6};
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array is:");
        printArray(arr);
	}
}
// Time complexity is always O(n^2) if the array is already sorted and no swap has to be there in array . 
// To make it more optimized solution we have to solve it using boolean and initialize it false so if at the end of the loop it remains false then return the array.


// Space complexity is always O(1).