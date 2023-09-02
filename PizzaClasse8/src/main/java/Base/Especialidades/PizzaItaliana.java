package Base.Especialidades;

import Base.Pizza;
import Base.Topping;

public class PizzaItaliana extends Pizza {

    public String salsa;

    public PizzaItaliana(String name, double price,String salsa, Topping... toppings) {
        super(name,  toppings);
        this.salsa = salsa;

    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

}
