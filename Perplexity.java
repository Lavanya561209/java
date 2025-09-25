class Perplexity {
public static void askingQuestion(String help, int quantity) {
System.out.println("The available tool is : " + help + " has the quantity " + quantity);
}
public static void askingQuestion(int price,long referenceNumber) {
System.out.println("The uploading cost is : " + price + " and then " +referenceNumber);
}
public static double askingQuestion(boolean isAvaliable,int timings) {
System.out.println("The uploading files into tool is: " + isAvaliable +"   "+ " And the time is consumed to ask the doubt is: " + timings);
return 3;
}
public static void main(String[] args) {
askingQuestion("Any Question", 6);
askingQuestion(300,9875690432l);
askingQuestion(true,5);
}
}