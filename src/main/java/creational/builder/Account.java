package creational.builder;

public class Account {
    String name;
    String address;
    Long aadharNumber;
    Long phoneNumber;
    String officeAddress;
    Long salary;
    String maritalStatus;

    public Account(AccountBuilder accountBuilder) {
        this.name = accountBuilder.name;
        this.address = accountBuilder.address;
        this.aadharNumber = accountBuilder.aadharNumber;
        this.phoneNumber = accountBuilder.phoneNumber;
        this.officeAddress = accountBuilder.officeAddress;
        this.salary = accountBuilder.salary;
        this.maritalStatus = accountBuilder.maritalStatus;
    }
}
