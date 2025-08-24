import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1234567L, "Joseph", 0.0);
        Account account2 = new Account(1234568L, "John", 1000);
        Account account3 = new Account(1234569L, "Stella", 100);
        Account account4 = new Account(1234560L, "Merry", 500);
        Account account5 = new Account(1234561L, "Veena", 2000.70);

        HashMap<Long, Account> accounts = new HashMap<>();
        accounts.put(account1.getAccountNo(), account1);
        accounts.put(account2.getAccountNo(), account2);
        accounts.put(account3.getAccountNo(), account3);
        accounts.put(account4.getAccountNo(), account4);
        accounts.put(account5.getAccountNo(), account5);

        SavingAccount sAcc = new SavingAccount(1234567L, "Joseph", 1000);
        sAcc.calculateInterest(1000);

        currentAccount cAcc = new currentAccount(1234561L, "Veena", 500);
        try{
            cAcc.calculateInterest(5000);
        } catch (LowBalanceException e) {
            throw new RuntimeException("Low Balance !!!");
        }

    }
}