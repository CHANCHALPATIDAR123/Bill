
public class DeluxPizza extends Pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
    }

    public void addExtraCheese() {
        this.price += this.extraCheesePrice;
    }

    public void addExtraToppings() {
        this.price += this.extraToppingsPrice;
    }
}
