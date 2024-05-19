//
//interface BankingAccount{
//    public SavingsAccount createAccount(String acc_type, int depositAmount);
//    public void deposit(int depositAmount);
//    public void withdraw(int accountNumber, int withdrawAmount);
//    public void transferFunds(int fromAccount, int toAccount, int amount);
//
//    public void viewTransactions();
//}
//
//class SavingsAccount implements BankingAccount{
//    static int accountNumber = 10000;
//    int id;
//    int balance;
//
//    public SavingsAccount(int id, int balance) {
//        this.id = id;
//        this.balance = balance;
//    }
//
//    @Override
//    public SavingsAccount createAccount(int id, int depositAmount) {
//        return new SavingsAccount(id, depositAmount);
//    }
//
//    @Override
//    public void deposit(int depositAmount) {
//        this.balance = this.balance + depositAmount;
//    }
//
//    @Override
//    public void withdraw(int withdrawAmount) {
//
//    }
//
//    @Override
//    public void transferFunds(int fromAccount, int toAccount, int amount) {
//
//    }
//
//    @Override
//    public void viewTransactions() {
//
//    }
//}
//
//class CheckingAccount implements BankingAccount{
//
//    @Override
//    public void createAccount(String acc_type, int depositAmount) {
//
//    }
//
//    @Override
//    public void deposit(int accountNumber, int depositAmount) {
//
//    }
//
//    @Override
//    public void withdraw(int accountNumber, int withdrawAmount) {
//
//    }
//
//    @Override
//    public void transferFunds(int fromAccount, int toAccount, int amount) {
//
//    }
//
//    @Override
//    public void viewTransactions() {
//
//    }
//}
//
//public class exam2 {
//}
