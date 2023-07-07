import java.util.*;
public class find {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(m==arr[i])
            System.out.print(i);
            else
            System.out.print(-1);
        }
    }
}
