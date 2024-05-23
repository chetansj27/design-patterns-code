package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        BankInterface publicBank = bankFactory.getBank("public");
        System.out.println(publicBank.getBank());
        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        LoanInterface corporateLoan = loanFactory.getLoan("corporate");
        System.out.println(corporateLoan.getLoanLimit());
    }
}
