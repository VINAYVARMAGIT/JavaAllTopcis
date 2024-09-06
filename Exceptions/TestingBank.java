public class TestingBank {
    public static void main(String[] args) throws CustomException {

        Bank bank = new Bank(10000);

        bank.withDraw(500);
        bank.withDraw(5000);
        try {
            bank.withDraw(5000);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("All the lines have been executed.");
        }
    }
}
