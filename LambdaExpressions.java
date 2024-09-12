

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

interface FunctionCheck{
    //abstract boolean check(int n);
    // abstract boolean empty(String s);
    // abstract int diff(int a,int b);
    //abstract int lengthOf(String s);
    // abstract String num(int n);
    abstract int noOfLetters(String s);
}


public class LambdaExpressions {
    public static void main(String[] args) {
        //If a number is positive
        // FunctionCheck number = (n)-> n>0;
        // System.out.println(number.check(5));

        //If a String is empty
        // FunctionCheck string = str -> str.isEmpty();
        // System.out.println(string.empty(""));
         
        //Two Numbers Difference
        // FunctionCheck twoNum = (a,b) -> a>b? a-b: b-a;
        // System.out.println(twoNum.diff(6, 10));

         //Length of the string
        // FunctionCheck string = str -> str.length();
        // System.out.println(string.lengthOf("VinayVarma"));

        //Check if it's a prime number
        // FunctionCheck isPrime = n -> {
        //     if(n<=1) return "notPrime";
        //     for (int i = 2; i < n/2; i++) if (n%i==0) return "notPrime";
        //     return "Prime";
        // };
        // System.out.println(isPrime.num(7));

        //Remember  there's a Function interface in the java from 8 version which
        //is in the form of Function<T,R> in which the T is the input to be ataken and the R is the output in the form of string
        //It has inbuilt methods like apply(T t) which takes the input of type T 
        
        
        // Function<LocalDate, String> formatDate = date -> {
        //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //     return date.format(formatter);
        // };

        // Testing the lambda
        // LocalDate today = LocalDate.now();
        // String formattedDate = formatDate.apply(today);
        // System.out.println("Formatted Date: " + formattedDate); 

        //Print only Letters in a String
        FunctionCheck print = name -> {
            char[] ch = name.toCharArray();
            int count =0;
            for (int i = 0; i < ch.length; i++)
                if (ch[i]>='a' && ch[i]<='z'|| ch[i]>='A' && ch[i]<='Z') count++;
                return count;
        };
        
        System.out.println(print.noOfLetters("wdih38u"));
    }
}
