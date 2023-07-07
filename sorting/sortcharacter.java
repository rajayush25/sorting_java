// import java.util.*;
// class sortcharacter{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         Scanner s1=new Scanner(System.in);
//         int n;
//         System.out.println("Enter the number of elements");
//         n=s.nextInt();
//         String arr[]=new String[n];
//         System.out.println("Enter the name of character");
//         for(int i=0;i<n;i++){
//             arr[i]=s1.nextLine();
//         }
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
//Java Program to sort an array in alphabetical order.
import java.util.Arrays;  
import java.util.Scanner;

public class sortcharacter  
{  
   public static void main(String args[])   
   {  
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);

      int n;    //Declare array size
      System.out.println("Enter the number of elements ");
      n=sc.nextInt();     //Initialize array size

      String str[]=new String[n];   //Declare array
      System.out.println("Enter the String ");
      for(int i=0; i<n ;i++)     //Initialize array
      {
          str[i]=sc1.nextLine();
      }

      Arrays.sort(str);    //Sort the array in alphabetical order

      System.out.println(Arrays.toString(str));  //Display the array
   }  
}  