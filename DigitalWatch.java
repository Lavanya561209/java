class DigitalWatch {
String watchName;
int price;
boolean isAvailable;
float rating = 4.7f;        
byte boxNumber = 5;         
public DigitalWatch() {
System.out.println("It is easy to access");
}
public DigitalWatch(String instructions) {
System.out.println("how to use: " + price);
}
public DigitalWatch(int price, boolean isAvailable) {
System.out.println("The price of product is: " + price + "Is the product Available: " + isAvailable);
}
public static void main(String[] args) {
DigitalWatch wl = new DigitalWatch();
DigitalWatch wl1 = new DigitalWatch("Casio");
DigitalWatch wl2 = new DigitalWatch(900, true);
System.out.println("Rating: " + wl2.rating);
System.out.println("It box number is : " + wl2.boxNumber);
    }
}