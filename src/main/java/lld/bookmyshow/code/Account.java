package lld.bookmyshow.code;

import lld.bookmyshow.code.models.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword() {
        System.out.println("send password reset email/otp");
        return true;
    }
}
