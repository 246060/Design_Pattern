package factory_method.case1.factory;

import factory_method.case1.product.IDCard;
import factory_method.case1.product.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard) p).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}
}
