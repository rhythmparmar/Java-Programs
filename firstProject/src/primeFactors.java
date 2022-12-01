import java.util.*;

public class primeFactors {
     public static void main(String[] args){
          Scanner scan=new Scanner(System.in);

          int number,i;
          System.out.print("Enter Number: ");
          number=scan.nextInt();

          for(i=2;i<=number;i++){
               while(number%2==0){
                    System.out.println(i+" ");
                    number=number/i;
               }
          }
          if(number>2){
               System.out.println(number);
          }
     }
}
