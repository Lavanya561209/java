class PortableTv {
  String modelName;
  boolean inStock;
  int displaySizeInInches;
  double retailPrice;
  public PortableTv(String modelName, boolean inStock, int displaySizeInInches, double retailPrice) {
    this.modelName = modelName;
    this.inStock = inStock;
    this.displaySizeInInches = displaySizeInInches;
    this.retailPrice = retailPrice;

    System.out.println("Model Name : " + modelName + " is in stock : " + inStock
        + " Display Size : " + displaySizeInInches + " Retail Price : " + retailPrice);
    turnOn();
  }

  public void turnOn() {
    System.out.println("Model Name is : " + modelName + " and then turn On the Tv : " + inStock);
    turnOff();
 }
  public int changeChannel(int channel) {
    System.out.println("Changed to channel " + channel);
    return -1;
  }

  public void turnOff() {
    System.out.println("Then turnoff it : " + displaySizeInInches);
    changeChannel(120);
  }
}