import java.util.HashMap;

public class Account {
    private Long accountNo;
    private String accountHolder;
    private double balance;

    public Account(Long accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void calculateInterest(double balance){
        System.out.println("Interest is calculated");
    }
}