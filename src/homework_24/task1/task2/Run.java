package homework_24.task1.task2;

public class Run {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(500);
        bankAccount.checkBalance();

        bankAccount.withdrawMoney(20);
        bankAccount.checkBalance();

        bankAccount.depositTransfer(50);
        bankAccount.checkBalance();

        ElectronicWallet electronicWallet = new ElectronicWallet(300);
        electronicWallet.checkBalance();

        electronicWallet.withdrawMoney(60);
        electronicWallet.checkBalance();

        bankAccount.depositTransfer(70);
        electronicWallet.checkBalance();

        electronicWallet.transferMoney(50,bankAccount);
        bankAccount.checkBalance();
        electronicWallet.checkBalance();
    }
}
