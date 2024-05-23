package creational.abstractfactory;

public class BankFactory extends AbstractFactory {
    @Override
    public BankInterface getBank(String bank) {
        if (bank.equalsIgnoreCase("Public")) {
            return new PublicBank();
        } else if (bank.equalsIgnoreCase("Private")) {
            return new PrivateBank();
        }
        return null;
    }

    @Override
    public LoanInterface getLoan(String loanType) {
        return null;
    }
}
