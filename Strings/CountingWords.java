package Strings;

public class CountingWords {
  public static void main(String[] args) {
    String s ="java   is    easy";
    int l=0;
    int count=1;
    while (l<s.length()) {
        char[] ch = s.toCharArray();
        if (ch[l]==' '&& ch[l+1]!=' ') {
            count++;
        }
        l++;
    }
    System.out.println("The number of words in the String is: "+count);
  }
}
