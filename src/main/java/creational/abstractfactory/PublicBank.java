package creational.abstractfactory;

public class PublicBank implements BankInterface{
    @Override
    public String getBank() {
        return "public";
    }
}
