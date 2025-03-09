public class CheckingAccount extends BankAccount{
    public CheckingAccount() {
    }

    public CheckingAccount(String accountHolder, int Bakiye) {
        super(accountHolder, Bakiye);
    }

    @Override
    public int CalculateInterest() {
        return super.CalculateInterest();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Checking accounts do not earn interest.");
    }
}
