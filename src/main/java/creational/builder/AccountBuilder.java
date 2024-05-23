package creational.builder;

public class AccountBuilder {
    String name;
    String address;
    Long aadharNumber;
    Long phoneNumber;
    String officeAddress;
    Long salary;
    String maritalStatus;

    public AccountBuilder(String name, String address, Long aadharNumber) {
        this.name = name;
        this.address = address;
        this.aadharNumber = aadharNumber;
    }

    public AccountBuilder setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AccountBuilder setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
        return this;
    }

    public AccountBuilder setSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public AccountBuilder setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public Account build() {
        return new Account(this);
    }
}
