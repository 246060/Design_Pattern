package factory_method.case1;

abstract public class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    abstract protected Product createProduct(String owner);
    abstract protected void registerProduct(Product p);
}
