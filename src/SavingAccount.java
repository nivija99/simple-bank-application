public class SavingAccount extends BanckAccount{
    public SavingAccount(Long accountNo, String accountHolder, double balance) {
        super(accountNo, accountHolder, balance);
    }

    @Override
    public void calculateInterest(double balance) {
        double balanceT = balance * 0.05 + balance;
        System.out.println("Balance after calculating interest "+balanceT);
    }
}
