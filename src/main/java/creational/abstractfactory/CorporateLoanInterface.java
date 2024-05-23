package creational.abstractfactory;

public class CorporateLoanInterface implements LoanInterface {
    @Override
    public Long getLoanLimit() {
        return 3000000L;
    }
}
