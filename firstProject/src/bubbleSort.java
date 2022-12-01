import java.util.*;
public class bubbleSort {
     
     int arr[]=new int[5];

     void getData(){
          Scanner scan=new Scanner(System.in);
          for(int i=0;i<arr.length;i++){
               System.out.println("Enter Number: ");
               arr[i]=scan.nextInt();
          }
     }
     void display(){
          int i;
          for(i=0;i<arr.length;i++){
               System.out.println(arr[i]);
          }
     }
     void sort(){
          int i,j,t;
          for(i=0;i<arr.length;i++){
               for(j=0;j<arr.length-i;j++){
                    if(arr[j]>arr[j+1]){
                         t=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=t;
                    }
               }
          }
     }
}

class sortedArray{
     public static void main(String[] args) {

          bubbleSort b=new bubbleSort();
          b.getData();
          System.out.println("Unsorted array: ");
          b.display();
          System.out.println("");
          System.out.println("Sorted array: ");
          b.sort();
          b.display();
     }
}

/*
Time Complexity	
Worst - O(n2)
Average -	O(n2)
Space Complexity -	O(1)
Stability - No 
*/
