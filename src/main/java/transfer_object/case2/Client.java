package transfer_object.case2;


import transfer_object.case2.customer.CustomerDto;
import transfer_object.case2.customer.CustomerResource;
import transfer_object.case2.product.Product;
import transfer_object.case2.product.ProductDto;
import transfer_object.case2.product.ProductResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Data Transfer Object pattern is a design pattern in which an data transfer object is used to
 * serve related information together to avoid multiple call for each piece of information.
 *
 * <p>In the first example, {@link Client} is a customer details consumer i.e. client to
 * request for customer details to server. {@link CustomerResource} act as server to serve customer
 * information. {@link CustomerDto} is data transfer object to share customer information.
 *
 * <p>In the second example, {@link Client} is a product details consumer i.e. client to
 * request for product details to server. {@link ProductResource} acts as server to serve
 * product information. {@link ProductDto} is data transfer object to share product information.
 *
 * <p>The pattern implementation is a bit different in each of the examples. The first can be
 * thought as a traditional example and the second is an enum based implementation.
 */
public class Client {

	public static void main(String[] args) {

		// Example 1: Customer DTO
		var customerOne = new CustomerDto("1", "Kelly", "Brown");
		var customerTwo = new CustomerDto("2", "Alfonso", "Bass");
		var customers = new ArrayList<>(List.of(customerOne, customerTwo));

		var customerResource = new CustomerResource(customers);

		System.out.println("All customers:-");
		var allCustomers = customerResource.getAllCustomers();
		printCustomerDetails(allCustomers);

		System.out.println("----------------------------------------------------------");

		System.out.println("Deleting customer with id {1}");
		customerResource.delete(customerOne.getId());
		allCustomers = customerResource.getAllCustomers();
		printCustomerDetails(allCustomers);

		System.out.println("----------------------------------------------------------");

		System.out.println("Adding customer three}");
		var customerThree = new CustomerDto("3", "Lynda", "Blair");
		customerResource.save(customerThree);
		allCustomers = customerResource.getAllCustomers();
		printCustomerDetails(allCustomers);

		// Example 2: Product DTO
		Product tv = new Product().setId(1L).setName("TV").setSupplier("Sony").setPrice(1000D).setCost(1090D);
		Product microwave = new Product()
						.setId(2L)
						.setName("microwave")
						.setSupplier("Delonghi")
						.setPrice(1000D)
						.setCost(1090D);

		Product refrigerator = new Product()
						.setId(3L)
						.setName("refrigerator")
						.setSupplier("Botsch")
						.setPrice(1000D)
						.setCost(1090D);

		Product airConditioner = new Product()
						.setId(4L)
						.setName("airConditioner")
						.setSupplier("LG")
						.setPrice(1000D)
						.setCost(1090D);

		List<Product> products = new ArrayList<>(Arrays.asList(tv, microwave, refrigerator, airConditioner));

		ProductResource productResource = new ProductResource(products);

		System.out.println("####### List of products including sensitive data just for admins: \n " + Arrays.toString(productResource.getAllProductsForAdmin().toArray()));
		System.out.println("####### List of products for customers: \n {}" + Arrays.toString(productResource.getAllProductsForCustomer().toArray()));
		System.out.println("####### Going to save Sony PS5 ...");

		ProductDto.Request.Create createProductRequestDto =
						new ProductDto.Request.Create()
										.setName("PS5")
										.setCost(1000D)
										.setPrice(1220D)
										.setSupplier("Sony");

		productResource.save(createProductRequestDto);

		System.out.println("####### List of products after adding PS5: " + Arrays.toString(productResource.getProducts().toArray()));
	}

	private static void printCustomerDetails(List<CustomerDto> allCustomers) {
		allCustomers.forEach(customer -> System.out.println(customer.getFirstName()));
	}
}
