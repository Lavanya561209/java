class Grinder {
String grinderName;
int price;
boolean isAvailable;
float rating = 4.7f;        
byte boxNumber = 11;         
public Grinder() {
System.out.println("It is easy to run");
}
public Grinder(String instructions) {
System.out.println("how to use: " + price);
}
public Grinder(int price, boolean isAvailable) {
System.out.println("The price of product is: " + price +" Is the product Available: " + isAvailable);
}
public static void main(String[] args) {
Grinder gl = new Grinder();
Grinder gl1 = new Grinder("LG");
Grinder gl2 = new Grinder(10000, true);
System.out.println("Rating: " + gl2.rating);
System.out.println("It box number is : " + gl2.boxNumber);
    }
}