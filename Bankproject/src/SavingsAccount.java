public class SavingsAccount extends BankAccount{

    public SavingsAccount() {
    }

    public SavingsAccount(String accountHolder, int Bakiye) {
        super(accountHolder, Bakiye);
    }

    @Override
    public int CalculateInterest() {
        return super.CalculateInterest()*5/100;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(CalculateInterest());
    }
}
