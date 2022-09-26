package transfer_object.case2.product;

public final class Product {
  private Long id;
  private String name;
  private Double price;
  private Double cost;
  private String supplier;

  public Product(Long id, String name, Double price, Double cost, String supplier) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.cost = cost;
    this.supplier = supplier;
  }

  public Product() {
  }

  public Long getId() {
    return id;
  }

  public Product setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Product setName(String name) {
    this.name = name;
    return this;
  }

  public Double getPrice() {
    return price;
  }

  public Product setPrice(Double price) {
    this.price = price;
    return this;
  }

  public Double getCost() {
    return cost;
  }

  public Product setCost(Double cost) {
    this.cost = cost;
    return this;
  }

  public String getSupplier() {
    return supplier;
  }

  public Product setSupplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  @Override
  public String toString() {
    return "Product{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", price=" + price
        + ", cost=" + cost
        + ", supplier='" + supplier + '\''
        + '}';
  }
}
