package creational.abstractfactory;

public class PersonalLoanInterface implements LoanInterface {
    @Override
    public Long getLoanLimit() {
        return 200000L;
    }
}
