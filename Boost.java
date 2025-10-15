class Boost {

    String drinkName;
    int price;
    String flavor;
    float rating;

    public Boost() {
        this("Chocolate Boost");
        this.drinkName = drinkName;
        System.out.println("It is a No args Constructor");
    }

    public Boost(String drinkName) {
        this("Vanilla Boost", 220, "Energy Drink", 4.7f);
        this.drinkName = drinkName;
        System.out.println("It is a 1 args constructor");
        System.out.println("The drink name is " + drinkName);
    }

    public Boost(String drinkName, int price) {
        this();
        this.drinkName = drinkName;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The drink name is " + this.drinkName);
        System.out.println("The price of the drink is " + this.price);
    }

    public Boost(String drinkName, int price, String flavor) {
        this("Strawberry Boost", 180);
        this.drinkName = drinkName;
        this.price = price;
        this.flavor = flavor;
        System.out.println("It is a 3 args constructor");
        System.out.println("The drink name is " + this.drinkName);
        System.out.println("The price of the drink is " + this.price);
        System.out.println("The flavor of the drink is " + this.flavor);
    }

    public Boost(String drinkName, String flavor, float rating) {
        this.drinkName = drinkName;
        this.flavor = flavor;
        this.rating = rating;
        System.out.println("It is a 3 args constructor");
        System.out.println("Drink Name: " + this.drinkName);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Rating: " + this.rating);
    }

    public Boost(String drinkName, int price, String flavor, float rating) {
        this.drinkName = drinkName;
        this.price = price;
        this.flavor = flavor;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Drink Name: " + this.drinkName);
        System.out.println("Price: " + this.price);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Rating: " + this.rating);
    }
}