class Porter {
public static void makeAnOrder(String product, int quantity) {
System.out.println("The Product is : " + product + " has the quantity " + quantity);
}
public static void makeAnOrder(int price,long phoneNumber) {
System.out.println("The product cost is : " + price + " and then " + phoneNumber);
}
public static double makeAnOrder(boolean isAvaliable,int timings) {
System.out.println("Is the product isThere: " + isAvaliable +"   "+ " And the time is consumed to deliver the product are: " + timings);
return 2;
}
public static void main(String[] args) {
makeAnOrder("Materials", 7);
makeAnOrder(280,9875690432l);
makeAnOrder(true,5);
}
}