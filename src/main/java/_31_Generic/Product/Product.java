package _31_Generic.Product;

// product 패키지
// ProductController.java, Product.java
// 상품 정보, => 상품명(Product Name), 상품정보(ProductInfo)
// 실행 예시

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Product <T>{
    private String ProductName;
    private T ProductInfo;

    @Override
    public String toString() {
        return ProductName + ProductInfo;
    }

}
