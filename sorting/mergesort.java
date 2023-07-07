import java.util.*;
class mergesort{
    public static void merge(int arr[],int st,int mid,int end){
        int merged[]=new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                merged[k++]=arr[i++];
            }
            else{
                merged[k++]=arr[j++];
            }
        }
        while(i<=mid){
            merged[k++]=arr[i++];
        }
        while(j<=end){
            merged[k++]=arr[j++];
        }
        for(int ix=0,jy=st ;ix<merged.length;ix++,jy++){
           arr[jy]=merged[ix];
        }
    }
    public static void divide(int arr[],int st,int end){
        if(st>=end) 
        return;
        int mid=st+(end-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,end);
        merge(arr,st,mid,end);
     }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=s.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    //     System.out.println();
    }
}
