 package Recursions;
import java.util.Scanner;
// public class Fibonacci {
//    public static void main(String[] args) {
//     int a =0;
//     int b =1;
//     System.out.print(a+" "+b+" ");
//     for (int i = 2; i < 10; i++) {
//       int c = a+b;
//       System.out.print(c+" ");
//       a=b;
//       b=c;
//     }
//    }
// }

public class RecursiveFibonacci{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Range for the Fibonnaci: ");
      int n =s.nextInt();
      String str ="";
      String all=series(n,str,0,1);
      System.out.println( "The fibonnaci Series is: "+ "0"+" "+"1 "+ all);
   }

   public static String series(int n,String s,int a,int b){
      if (n==2)  return "";
      int c = a+b;
      return c +" "+series(n-1, s, b, c);
   }
}
