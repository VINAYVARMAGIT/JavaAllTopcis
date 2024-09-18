import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExp{
    public static void main(String[] args) {
        //String name = "Vinay Varma";
        //Normal checking of exp
        //String s ="ar"
        //Using dot to add the letters
        //String s = "..a.";
        //Character set:
        //[a-z],[A-Z],[0-9] [a-z A-Z 0-9]
        // String s ="[0-9 A-Z]";
        // String name ="vin\\\\var";
        // String s= "\\\\";
        //Quantifiers
        String name ="ababbabrrbbaabbabababbbaaa";
        String s ="abr{2,3}";

        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(name);
        int count =0;
        while (m.find()) {
            count++;
            //System.out.println(m.start());
            // System.out.println(m.end());
             System.out.println(m.group());
        }
        System.out.println("The number of times the exp is repeating "+ count);
    }
}