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

    public void depositMoney(double amount){
        if(amount <= 0){
            System.out.println("Kindly enter the amount above 0");
        } else {
            this.balance = this.balance + amount;
            System.out.println("Balance after deposit is "+ this.balance);
        }
    }

    public void withdrawMoney(double amount){
        if(amount > this.balance){
            System.out.println("You doesn't have enough money in your account. Kindly check balance before withdraw!!");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Amount is withdraw successfully!!!");
        }
    }

    public void searchByAccountNo(HashMap accounts, Long accountNo) throws AccountNotFoundException{
        if(accounts.containsKey(accountNo)){
            System.out.println(accounts.get(accountNo).toString());
        } else {
            throw new AccountNotFoundException("There is no account for the given account No :" + accountNo);
        }
    }

    public void checkBalance(){
        System.out.println("Balance amount in your account is "+this.balance);
    }
}
