package lld.vendingmachine.code;

import lld.vendingmachine.code.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductShelf {
    int code;
    Product product;
    boolean soldOut;
}
