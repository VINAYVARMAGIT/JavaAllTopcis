public class Bank {
    int accBal;

public Bank(int accBal) {
    this.accBal = accBal;
}

   public void withDraw(int amount) throws CustomException{
    if (amount>accBal) {
        throw new CustomException();
    }
    accBal -= amount;
    System.out.println("The amount left is " +accBal);
   }
}
