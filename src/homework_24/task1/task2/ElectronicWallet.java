package homework_24.task1.task2;

public class ElectronicWallet implements PaymentSystem{
    double balance;

    public ElectronicWallet(double balance){
        this.balance = balance;

    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.printf("Снятие средств %s $\n", amount);
        balance -= amount;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.printf("Баланс пополнен на %s $\n", amount);
        balance += amount;
    }

    @Override
    public void checkBalance() {
        System.out.printf("Ваш остаток на счете  %s $\n", balance);
    }

    @Override
    public void transferMoney(double amount, BankAccount recipient) {
        balance-=amount*1.1;
        recipient.balance+=amount;
    }

    @Override
    public void transferMoney(double amount, ElectronicWallet recipient) {
        balance-=amount;
        recipient.balance+=amount;
    }

}
