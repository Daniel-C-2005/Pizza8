package edu.ejercicios;

import Base.Interfaces.PizzaBase;
import Base.Topping;
import Base.Especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {


        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 10.99, "Tomato Suace");
        pizzaItaliana.addTopping(new Topping("Tomato "));
        pizzaItaliana.addTopping(new Topping("Mozzarella"));
        pizzaItaliana.addTopping(new Topping("Piña"));
        pizzaItaliana.prepare();
        System.out.println("This is salsa"+pizzaItaliana.getSalsa());
        





    }

}