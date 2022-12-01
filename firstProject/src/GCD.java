import java.util.*;
public class GCD {
     public static void main(String[] args){
          Scanner scan=new Scanner(System.in);
          
          int a,b,i,g=0;
          System.out.print("Enter a: ");
          a=scan.nextInt();
          System.out.print("Enter b: ");
          b=scan.nextInt();

          for(i=1;i<=a && i<=b;i++){
               if(a%i==0 && b%i==0){
                    g=i;
               }
          }
          System.out.println("GCD of Numbers is: "+g);
     }
}
