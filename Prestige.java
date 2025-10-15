class Prestige {

    String applianceName;
    int price;
    String category;
    float rating;

    public Prestige() {
        this("Pressure Cooker");
        this.applianceName = applianceName;
        System.out.println("It is a No args Constructor");
    }

    public Prestige(String applianceName) {
        this("Mixer Grinder", 3500, "Kitchen Appliance", 4.5f);
        this.applianceName = applianceName;
        System.out.println("It is a 1 args constructor");
        System.out.println("The appliance name is " + applianceName);
    }

    public Prestige(String applianceName, int price) {
        this();
        this.applianceName = applianceName;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The appliance name is " + this.applianceName);
        System.out.println("The price of the appliance is " + this.price);
    }

    public Prestige(String applianceName, int price, String category) {
        this("Gas Stove", 2800);
        this.applianceName = applianceName;
        this.price = price;
        this.category = category;
        System.out.println("It is a 3 args constructor");
        System.out.println("The appliance name is " + this.applianceName);
        System.out.println("The price of the appliance is " + this.price);
        System.out.println("The category of the appliance is " + this.category);
    }

    public Prestige(String applianceName, String category, float rating) {
        this.applianceName = applianceName;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 3 args constructor");
        System.out.println("Appliance Name: " + this.applianceName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }

    public Prestige(String applianceName, int price, String category, float rating) {
        this.applianceName = applianceName;
        this.price = price;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Appliance Name: " + this.applianceName);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }
}