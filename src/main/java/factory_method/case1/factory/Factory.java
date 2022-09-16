package factory_method.case1.factory;

import factory_method.case1.product.Product;

abstract public class Factory {

	// 탬플릿 메소드
	public final Product create(String owner) {
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}

	abstract protected Product createProduct(String owner);
	abstract protected void registerProduct(Product p);
}
