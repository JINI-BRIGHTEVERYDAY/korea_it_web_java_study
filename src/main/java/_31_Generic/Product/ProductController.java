package _31_Generic.Product;

// product 패키지
// ProductController.java, Product.java
// 상품 정보, => 상품명(Product Name), 상품정보(ProductInfo)
// Product(produceName=Laptop, productInfo = Intel i7, 16GB RAN, 512GB SSD) String
// Product(produceName=SmartPhone, productInfo = 799.99) Double
// Product(produceName = Available, productInfo = true) Boolean
// 실행 예시


public class ProductController {
    public static void main(String[] args) {

        Product<String> product1 = new Product<>("Laptop", "Intel i7, 16GB RAN, 512GB SSD");
        Product<Double> product2 = new Product<>("SmartPhone", 799.99);
        Product<Boolean> product3 = new Product<>("Available", true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
