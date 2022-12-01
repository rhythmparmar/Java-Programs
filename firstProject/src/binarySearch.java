import java.util.*;
public class binarySearch {
     int arr[]=new int[10];
     int key;

     void getData(){
          Scanner scan=new Scanner(System.in);
          int i;
          for(i=0;i<10;i++){
               System.out.println("Enter no.: ");
               arr[i]=scan.nextInt();
          }
          System.out.println("Enter value to  Search: ");
          key=scan.nextInt();
     }

     void Search(){
          int i,j,mid,flag,pos=0;
          i=0;
          j=arr.length-1;       // 9
          flag=0;
          while(i<=j && flag==0){
               mid=(i+j)/2;
               if(arr[mid]==key){
                    flag=1;
                    pos=mid+1;
               }

               if(arr[mid]>key){
                   j=mid-1; 
               }

               if(arr[mid]<key){
                    i=mid+1;
               }
               if(flag==1){
                    System.out.println("Element found at: "+pos);
               }
               else{
                    System.out.println("Element not found");
               }
          }
     }
}

class Demo{
     public static void main(String[] args) {
     binarySearch a=new binarySearch();
     a.getData();
     a.Search();
     }
}
