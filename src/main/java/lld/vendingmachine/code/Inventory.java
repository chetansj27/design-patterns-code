package lld.vendingmachine.code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {
    ProductShelf[] productShelves;

    Inventory(int productCount) {
        productShelves = new ProductShelf[productCount];
        fillUpInventory();
    }

    public void addProduct(Product product, int codeNumber) throws Exception {
        for (ProductShelf productShelf : productShelves) {
            if (productShelf.code == codeNumber) {
                if (productShelf.isSoldOut()) {
                    productShelf.product = product;
                    productShelf.setSoldOut(false);
                } else {
                    throw new Exception("already product is present, you can not add product here");
                }
            }
        }
    }

    public Product getProduct(int codeNumber) throws Exception {

        for (ProductShelf productShelf : productShelves) {
            if (productShelf.code == codeNumber) {
                if (productShelf.isSoldOut()) {
                    System.out.println("product already sold out");
                    throw new Exception("product already sold out");
                } else {
                    return productShelf.product;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutProduct(int codeNumber) {
        for (ProductShelf productShelf : productShelves) {
            if (productShelf.code == codeNumber) {
                productShelf.setSoldOut(true);
            }
        }
    }

    public void fillUpInventory() {
        int startCode = 101;
        for (int i = 0; i < productShelves.length; i++) {
            Product newProduct = new Product();
            if (i < 3) {
                newProduct.setType(ProductType.COKE);
                newProduct.setPrice(12);
            } else if (i < 5) {
                newProduct.setType(ProductType.PEPSI);
                newProduct.setPrice(9);
            } else if (i < 7) {
                newProduct.setType(ProductType.JUICE);
                newProduct.setPrice(13);
            } else if (i < 10) {
                newProduct.setType(ProductType.SODA);
                newProduct.setPrice(7);
            }
            ProductShelf space = new ProductShelf();
            space.setCode(startCode + i);
            space.setProduct(newProduct);
            space.setSoldOut(false);
            productShelves[i] = space;
        }
    }

    public void displayInventory() {
        for (ProductShelf slot : productShelves) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Product: " + slot.getProduct().getType().name() +
                    " Price: " + slot.getProduct().getPrice() +
                    " isAvailable: " + !slot.isSoldOut());
        }
    }

}
