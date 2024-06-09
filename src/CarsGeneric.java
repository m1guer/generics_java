/**
 * Cars
 */
public abstract class CarsGeneric {
  private Long price;
  private String brand;
  private String name;

  public CarsGeneric(Long price, String brand, String name) {
    this.name = name;
    this.brand = brand;
    this.price = price;
  }

  public void listCars() {

    System.out.println("Car [name=" + name + ", brand=" + brand + ", price=" + price + "]");
  }
}
