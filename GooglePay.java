class GooglePay{
public static void transferingMoney(long transactionId) {
System.out.println("Transfering money with its id is :"+transactionId );
}
public static void transferingMoney(int price,long accountNumber) {
System.out.println("The price of sending money is : " + price + " and then " +accountNumber);
}
public static String transferingMoney(String available,int timings) {
System.out.println("The available balance is: " + available +"   "+ " And the time to share the money is: " + timings);
return available;
}
public static void main(String[] args) {
transferingMoney(547689905l);
transferingMoney(700,8975690432l);
transferingMoney("yes",5);
}
}