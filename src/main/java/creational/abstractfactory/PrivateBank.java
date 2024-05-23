package creational.abstractfactory;

public class PrivateBank implements BankInterface{
    @Override
    public String getBank() {
        return "private";
    }
}
