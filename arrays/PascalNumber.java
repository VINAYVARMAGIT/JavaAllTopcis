public class PascalNumber {
  public static void main(String[] args) {
    int [][] a = new int[5][];
    for (int i = 0; i < a.length; i++) {
        a[i]= new int[i+1];
        for (int j = 0; j < a[i].length; j++) {
            if (i==j ||j==0) {
                a[i][j]=1;
            } else {
                a[i][j]= a[i-1][j]+a[i-1][j-1];
            }
        }
    }
    for (int[] is : a) {
        for (int i = 0; i < 5-is.length; i++) {
            System.out.print(" ");
        }
        for (int is2 : is) {
            System.out.print(" "+is2);
        }
        System.out.println("");
    }
  }
}
