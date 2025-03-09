import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      BankAccount bankAccount=new SavingsAccount("MERT",8000);
      BankAccount bankAccount1=new CheckingAccount("EMRAH",5000);


        System.out.println("SavingsAccount info" );
        bankAccount.info();
        System.out.println(bankAccount.CalculateInterest());

        System.out.println("checkingAccount");
        bankAccount1.info();
        System.out.println(bankAccount1.CalculateInterest());


    }
}