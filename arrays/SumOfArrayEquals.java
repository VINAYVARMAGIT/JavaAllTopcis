public class SumOfArrayEquals {
  public static void main(String[] args) {
    int [] ar = {3,7,5,8,4,2,8,4,8,3,5};

    int val = 10;

    for (int i = 0; i < ar.length; i++) {
        for (int j = 0; j < ar.length; j++) {
            if (ar[i]+ar[j]==val) {
                System.out.println(ar[i]+"+"+ar[j]+"="+val);
            }
        }
    }

  }
}
