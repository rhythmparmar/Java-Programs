import java.util.*;
public class linearSearch {
     
     int arr[]=new int[10];
     int key;

     void getData(){
          Scanner scan=new Scanner(System.in);
          int i;
          for(i=0;i<10;i++){
              System.out.print("Enter Number: ");
              arr[i]=scan.nextInt(); 
          }
          System.out.print("Enter to search: ");
          key=scan.nextInt();
     }

     void Search(){
          int i,flag=0,pos=0;
          
          for(i=0;i<10 && flag==0;i++){
               if(arr[i]==key){
                    flag=1;
                    pos=i+1;
               }
          }
          if(flag==1)
               System.out.println("No. found at: "+pos);
          else
               System.out.println("No. not found");

     }
}

class Demo{
     public static void main(String[] args) {
          linearSearch a=new linearSearch();
          a.getData();
          a.Search();
     }
}
