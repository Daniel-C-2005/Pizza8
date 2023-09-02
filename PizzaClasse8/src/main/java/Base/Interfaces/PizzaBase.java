package Base.Interfaces;

public class PizzaBase implements Ipreparable {
    private String nombre;
    private double precio;
    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando pizza.....");
        System.out.printf("La pizza esta lista!!!!!");
    }
}
