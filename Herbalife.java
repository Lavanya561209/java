class Herbalife {

    String productName;
    int price;
    String category;
    float rating;

    public Herbalife() {
        this("Protein Shake");
        this.productName = productName;
        System.out.println("It is a No args Constructor");
    }

    public Herbalife(String productName) {
        this("Aloe Vera Gel", 1200, "Health Supplement", 4.6f);
        this.productName = productName;
        System.out.println("It is a 1 args constructor");
        System.out.println("The product name is " + productName);
    }

    public Herbalife(String productName, int price) {
        this();
        this.productName = productName;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The product name is " + this.productName);
        System.out.println("The price of the product is " + this.price);
    }

    public Herbalife(String productName, int price, String category) {
        this("Energy Drink", 950);
        this.productName = productName;
        this.price = price;
        this.category = category;
        System.out.println("It is a 3 args constructor");
        System.out.println("The product name is " + this.productName);
        System.out.println("The price of the product is " + this.price);
        System.out.println("The category of the product is " + this.category);
    }

    public Herbalife(String productName, String category, float rating) {
        this.productName = productName;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 3 args constructor");
        System.out.println("Product Name: " + this.productName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }

    public Herbalife(String productName, int price, String category, float rating) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }
}