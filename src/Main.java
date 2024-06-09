import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    List<CarsGeneric> carros = new ArrayList<>();
    carros.add(new Audi(10l, "audi", "audif9"));
    listarCarros(carros);
  }

  public static <T extends CarsGeneric> void listarCarros(List<CarsGeneric> cars) {
    for (CarsGeneric c : cars) {
      c.listCars();
    }
  }
}
