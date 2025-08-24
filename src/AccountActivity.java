import java.util.HashMap;

public interface AccountActivity {
    public void depositMoney(double amount);

    public void withdrawMoney(double amount);

    public void searchByAccountNo(HashMap accounts, Long accountNo) throws AccountNotFoundException;

    public void checkBalance();
}
