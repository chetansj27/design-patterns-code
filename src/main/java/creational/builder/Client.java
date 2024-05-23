package creational.builder;

public class Client {
    public static void main(String[] args) {
        Account account = new AccountBuilder("chetan", "haryana", 21231L)
                .setOfficeAddress("noida")
                .setSalary(2324L).build();
    }
}
