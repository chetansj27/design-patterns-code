package creational.abstractfactory;

public class LoanFactory extends AbstractFactory {
    @Override
    public BankInterface getBank(String bank) {
        return null;
    }

    @Override
    public LoanInterface getLoan(String loanType) {
        if (loanType.equalsIgnoreCase("personal")) {
            return new PersonalLoanInterface();
        } else if (loanType.equalsIgnoreCase("corporate")) {
            return new CorporateLoanInterface();
        }
        return null;
    }
}
