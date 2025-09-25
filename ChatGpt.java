class ChatGpt {
public static void askingDout(String help, int quantity) {
System.out.println("The available tool is : " + help + " has the quantity " + quantity);
}
public static void askingDout(int price,long referenceNumber) {
System.out.println("The uploading files cost is : " + price + " and then " +referenceNumber);
}
public static double askingDout(boolean isAvaliable,int timings) {
System.out.println("The uploading files into tool is: " + isAvaliable +"   "+ " And the time is consumed to ask the doubt is: " + timings);
return 2;
}
public static void main(String[] args) {
askingDout("What can I help?", 5);
askingDout(300,8975690432l);
askingDout(true,4);
}
}