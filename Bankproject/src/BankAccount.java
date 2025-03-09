import java.sql.SQLOutput;

public class BankAccount {

     private String AccountHolder;
     private int Bakiye;


     public BankAccount(){



     }
    public BankAccount(String accountHolder,int Bakiye) {
        this.AccountHolder = accountHolder;
        this.Bakiye=Bakiye;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public int getBakiye() {
        return Bakiye;
    }

    public void setBakiye(int bakiye) {
        Bakiye = bakiye;
    }

    public int CalculateInterest(){

         return  getBakiye();
    }
    public void info (){

        System.out.println("kullanıcı adı " + getAccountHolder() + " " + getBakiye() );

    }



}
