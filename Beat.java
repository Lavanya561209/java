class Beat {

    String deviceName;
    int price;
    String category;
    float rating;

    public Beat() {
        this("Bluetooth Speaker");
        this.deviceName = deviceName;
        System.out.println("It is a No args Constructor");
    }

    public Beat(String deviceName) {
        this("Wireless Headphones", 7500, "Audio Device", 4.7f);
        this.deviceName = deviceName;
        System.out.println("It is a 1 args constructor");
        System.out.println("The device name is " + deviceName);
    }

    public Beat(String deviceName, int price) {
        this();
        this.deviceName = deviceName;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The device name is " + this.deviceName);
        System.out.println("The price of the device is " + this.price);
    }

    public Beat(String deviceName, int price, String category) {
        this("Noise Cancelling Earbuds", 4500);
        this.deviceName = deviceName;
        this.price = price;
        this.category = category;
        System.out.println("It is a 3 args constructor");
        System.out.println("The device name is " + this.deviceName);
        System.out.println("The price of the device is " + this.price);
        System.out.println("The category of the device is " + this.category);
    }

    public Beat(String deviceName, String category, float rating) {
        this.deviceName = deviceName;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 3 args constructor");
        System.out.println("Device Name: " + this.deviceName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }

    public Beat(String deviceName, int price, String category, float rating) {
        this.deviceName = deviceName;
        this.price = price;
        this.category = category;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Device Name: " + this.deviceName);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
    }
}