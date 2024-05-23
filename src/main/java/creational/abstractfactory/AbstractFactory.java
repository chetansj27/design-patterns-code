package creational.abstractfactory;

public abstract class AbstractFactory {
    public abstract BankInterface getBank(String bank);

    public abstract LoanInterface getLoan(String loanType);
}
