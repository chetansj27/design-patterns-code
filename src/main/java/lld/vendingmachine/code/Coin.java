package lld.vendingmachine.code;

import lombok.Getter;

@Getter
public enum Coin {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    public final int value;

    Coin(int value) {
        this.value = value;
    }
}
