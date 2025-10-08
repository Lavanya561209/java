class Mixer {
String mixerName;
int price;
boolean isAvailable;
float rating = 3.7f;        
byte boxNumber = 8;         
public Mixer() {
System.out.println("It is easy to run");
}
public Mixer(String instructions) {
System.out.println("how to use: " + price);
}
public Mixer(int price, boolean isAvailable) {
System.out.println("The price of product is: " + price +" Is the product Available: " + isAvailable);
}
public static void main(String[] args) {
Mixer ml = new Mixer();
Mixer ml1 = new Mixer("Pigeon");
Mixer ml2 = new Mixer(1000, true);
System.out.println("Rating: " + ml2.rating);
System.out.println("It box number is : " + ml2.boxNumber);
    }
}