import java.util.Scanner;

public class primeNumbers {
     public static void main(String[] args) {

          int n, mid, i;
          System.out.println("Enter value of n: ");
          Scanner scan = new Scanner(System.in);
          n = scan.nextInt();

          mid=n/2;
          for(i=2;i<=mid;i++){
               if(n%i==0) {
                    break;
               }
          }
          if(i>mid){
               System.out.println("prime");
          } 
          else {
               System.out.println("Not prime");
          }
     

     }
}
