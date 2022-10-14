package Java_React;

public class Main {
    public static void main(String[] args) {

    Product product1 = new Product(7,"hp",16000,"76GB",10,14400);
    product1.setDetail("67gb");

    Product product2 = new Product(8,"hp5",19000,"52GB",15,15500);
    product2.setName("asus rog");
    Product[] productArr = {product1,product2};
//    for(Product product : productArr){
//        System.out.println(product.name);
//    }
    ProductManager productManager = new ProductManager();
    productManager.addToCart(product1);
    }
}
