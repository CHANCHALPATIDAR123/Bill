import java.util.Scanner;

public class Pizza {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

    protected int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;

    Scanner in = new Scanner(System.in);

    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese(1.y/ 2.n):");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                isExtraCheeseAdded = true;
                this.price = price + extraCheesePrice;
                break;
            case 2:
                isExtraCheeseAdded = false;
                break;

            default:
                System.out.println("please enter the valid choise");
                break;
        }
    }

    public void addExtraToppings() {
        System.out.println("want Extra Topping(1.y/2.n):");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                isExtraToppingsAdded = true;
                this.price = price + extraToppingsPrice;
                break;

            case 2:
                isExtraToppingsAdded = false;
                break;
            default:
                System.out.println("please enter the valid choice");
                break;
        }
    }

    public void takeAway() {
        System.out.println("Want TakeAway(1.y/2.n):");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                isOptedForTakeaway = true;
                this.price = price + backPackPrice;
                break;
            case 2:
                isOptedForTakeaway = false;
            default:
                System.out.println("please enter the valid choice");
                break;
        }
    }

    public void getBill() {
        String bill = " ";
        System.out.println("Pizza :" + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill = bill + "Extra Cheese:" + extraCheesePrice + "\n";
        }

        if (isExtraToppingsAdded) {
            bill = bill + "Extra Toppings:" + extraToppingsPrice + "\n";

        }

        if (isOptedForTakeaway) {
            bill = bill + "Take away :" + backPackPrice + "\n";
        }
        System.out.println(bill);
        System.out.println("\n\n\n Thanks you!!!! Visit Again............!!");
        System.out.println("--------------------------------------------------------------------------------");
    }
}
