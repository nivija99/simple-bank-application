public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1234567L,"Nivija",0.0);
        account1.withdrawMoney(100);
        account1.checkBalance();
        account1.depositMoney(1000);
        account1.withdrawMoney(342.25);
        account1.checkBalance();
    }
}