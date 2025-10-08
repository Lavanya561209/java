class JumboStove {
String stoveName;
int price;
boolean isAvailable;
float rating = 5.7f;        
byte boxNumber = 10;         
public JumboStove() {
System.out.println("It is ready to use");
}
public JumboStove(String instructions) {
System.out.println("how can we use: " + price);
}
public JumboStove(int gst, boolean isAvailable) {
System.out.println("The gst of product is: " + gst + "Is the product Available: " + isAvailable);
}
public static void main(String[] args) {
JumboStove sl = new JumboStove();
JumboStove sl1 = new JumboStove("Use Carefully");
JumboStove sl2 = new JumboStove(800, true);
System.out.println("Rating: " + sl2.rating);
System.out.println("It box number is : " + sl2.boxNumber);
    }
}