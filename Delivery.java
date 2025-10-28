class Delivery {
    public Delivery() {
        this(55.75);
        System.out.println("The delivery process has been initiated.");
    }

    public Delivery(double distance) {
        this("Parcel", false);
        System.out.println("The delivery distance is: " + distance + " km.");
    }

    public Delivery(String itemType, boolean isExpress) {
        System.out.println("Item type: " + itemType + " Express delivery: " + isExpress);
    }
}
