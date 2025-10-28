class Gifts {
    public Gifts() {
        this(2500.75);
        System.out.println("Gift can be ordered from the online store");
    }

    public Gifts(double cost) {
        this("FlowerBouquet", 5);
        System.out.println("The total cost of the gift is: " + cost);
    }
	 public Gifts(String giftName, int quantity) {
        System.out.println("Gift selected: " + giftName + "  Quantity of the gift is: " + quantity);
    }
}

