class Classmate {

    String itemName;
    int price;
    String category;
    float rating;

    public Classmate() {
        this("Notebook");
        this.itemName = itemName;
        System.out.println("It is a No args Constructor");
    }

    public Classmate(String itemName) {
        this("Geometry Box", 250, "Stationery Set", 4.5f);
        this.itemName = itemName;
        System.out.println("It is a 1 args constructor");
        System.out.println("The item name is " + itemName);
    }

    public Classmate(String itemName, int price) {
        this();
        this.itemName = itemName;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The item name is " + this.itemName);
        System.out.println("The price of the item is " + this.price);
    }

    public Classmate(String itemName, int price, String category) {
        this("Sketch Pen Set", 120);
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        System.out.println("It is a 3 args constructor");
        System.out.println("The item name is " + this.itemName);
        System.out.println("The price of the item is " + this.price);
        System.out.println("The category of the item is " + this.category);
    }

    public Classmate(String itemName, String category, float rating) {
        this.itemName = itemName;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 3 args constructor");
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }

    public Classmate(String itemName, int price, String category, float rating) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }
}