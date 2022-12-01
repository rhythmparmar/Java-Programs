import java.util.Scanner;
public class EvenOdd {
     public static void main(String[] args){

          float n;
          System.out.println("Enter n: ");

          Scanner scan=new Scanner(System.in);
          n=scan.nextFloat();

          if(n%2==0){
               System.out.println("Number is Even");
          }
          else{
               System.out.println("Number is not0 Odd");
          }

     }
}
