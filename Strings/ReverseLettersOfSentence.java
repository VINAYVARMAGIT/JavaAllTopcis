package Strings;

public class ReverseLettersOfSentence {
  public static void main(String[] args) {
    String s ="java is easy";
    String s1="";
    int j=0;
    int i=0;
    while (j<s.length()) {
        char[] ch = s.toCharArray();
        while (j<ch.length &&ch[j]!=' ') j++;
        int k = j-1;
        String temp ="";
        while (k>=i) {
            temp+=ch[k];
            k--;
        }
        s1+= temp;
        if (j<s.length()) {
            s1+=" ";
        }
        j++;
        i=j;
    }

    System.out.println(s1);
  }
}
