package lld.vendingmachine.code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    ProductType type;
    int price;
}
