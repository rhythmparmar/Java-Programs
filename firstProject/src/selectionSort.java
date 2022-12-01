import java.util.*;
public class selectionSort {

          int arr[]=new int[10];       //created an array of size 10

          void getData(){
               Scanner scan=new Scanner(System.in);
               int i;
               for(i=0;i<10;i++){
                    System.out.print("Enter Number: ");
                    arr[i]=scan.nextInt();
               }
          }
          void sort(){
               int i,j,t;
               for(i=0;i<9;i++){
                    for(j=i+1;j<10;j++){
                         if(arr[i]<arr[j]){
                              t=arr[i];
                              arr[i]=arr[j];
                              arr[j]=t;
                         }
                    }
               }

          }
          void display(){
               int i;
               for(i=0;i<10;i++){
                    System.out.print(arr[i]+" ");
               }
          }
}

class sortedArray{
     public static void main(String[] args) {
          selectionSort a=new selectionSort();        // created an object of uper wali class 
          
          a.getData();
          System.out.println("Unsorted array: ");
          a.display();
          System.out.println("");
          System.out.println("Sorted array: ");
          a.sort();
          a.display();
     }

}

/*
Time Complexity	
Worst - O(n2)
Average -	O(n2)
Space Complexity -	O(1)
Stability - No 
*/