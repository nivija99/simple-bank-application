public class currentAccount extends Account{
    public currentAccount(Long accountNo, String accountHolder, double balance) {
        super(accountNo, accountHolder, balance);
    }

    @Override
    public void calculateInterest(double balance) throws LowBalanceException{
        double balanceT = 0.0 * balance + balance;
        if(balance < 1000){
            throw new LowBalanceException("Your balance is less than 1000");
        }
        System.out.println("Balance after calculating interest "+balanceT);
    }
}
