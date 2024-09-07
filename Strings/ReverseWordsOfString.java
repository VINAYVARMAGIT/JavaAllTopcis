package Strings;

public class ReverseWordsOfString {
   public static void main(String[] args) {
    String s ="java is easy";
    String s1="";
    int i=s.length()-1;
    int j=s.length()-1;
    while (i>=0) {
        char []ch = s.toCharArray();
        while (i>=0 && ch[i]!=' ') i--;
        int k =i+1;
        String temp="";
        while(k<=j){
            temp+=ch[k];
            k++;
        }
        s1+=temp;
        if (i>=0) {
            s1+=" ";
        }
        i--;
        j=i;
    }
    System.out.println(s1);
   }
}
