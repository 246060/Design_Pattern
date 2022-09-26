package transfer_object.case2.product;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The resource class which serves product information. This class act as server in the demo. Which
 * has all product details.
 */
public class ProductResource {

	private final List<Product> products;

	public ProductResource(final List<Product> products) {
		this.products = products;
	}

	public List<ProductDto.Response.Private> getAllProductsForAdmin() {
		return products
						.stream()
						.map(p -> new ProductDto.Response.Private().setId(p.getId()).setName(p.getName())
										.setCost(p.getCost())
										.setPrice(p.getPrice()))
						.collect(Collectors.toList());
	}

	public List<ProductDto.Response.Public> getAllProductsForCustomer() {
		return products
						.stream()
						.map(p -> new ProductDto.Response.Public().setId(p.getId()).setName(p.getName())
										.setPrice(p.getPrice()))
						.collect(Collectors.toList());
	}

	public void save(ProductDto.Request.Create createProductDto) {
		products.add(new Product()
						.setId((long) (products.size() + 1))
						.setName(createProductDto.getName())
						.setSupplier(createProductDto.getSupplier())
						.setPrice(createProductDto.getPrice())
						.setCost(createProductDto.getCost()));
	}

	public List<Product> getProducts() {
		return products;
	}
}
