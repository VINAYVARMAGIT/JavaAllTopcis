package Strings;

public class CountDuplicate {
   public static void main(String args[]){
    String name = "vinay varma";

    // String newName = removeDuplicate(name);

    // System.out.println(newName);

    removeDuplicate(name);
   }
   public static void  removeDuplicate(String name){
    char[] ch = name.toCharArray();

    for (int i = 0; i < ch.length; i++) {
        char c1= ch[i];
        int count=49;
        for (int j = i+1; j < ch.length; j++) {
            if (c1==ch[j]) {        
                ch[j]= (char) count++;
            }
            if (ch[j]==' ') {
                ch[j]='\u0000';
            }
        }
    }
    // String name1 = new String(ch);
    // return name1;
    for(char c : ch){
        System.out.print(c);
    }
   }
}

