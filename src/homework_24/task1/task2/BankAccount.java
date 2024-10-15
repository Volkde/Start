package homework_24.task1.task2;

public class BankAccount implements PaymentSystem {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.printf("Снятие средств %s €\n", amount);
        balance -= amount;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.printf("Баланс пополнен на %s €\n", amount);
        balance += amount;
    }

    @Override
    public void checkBalance() {
        System.out.printf("Ваш остаток на счете %s €\n", balance);
    }

    @Override
    public void transferMoney(double amount, BankAccount recipient) {
        balance-=amount;
        recipient.balance+=amount;
    }

    @Override
    public void transferMoney(double amount, ElectronicWallet recipient) {
        balance-=amount;
        recipient.balance+=amount*1.1;
    }


}
