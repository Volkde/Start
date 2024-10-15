package homework_24.task1.task2;

public interface PaymentSystem{

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();
    void transferMoney(double amount, BankAccount account);
    void transferMoney(double amount, ElectronicWallet wallet);
}
