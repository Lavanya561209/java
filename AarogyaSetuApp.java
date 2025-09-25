class AarogyaSetuApp {
public static void medical(String address, int usingThisApp) {
System.out.println("The adress of the person is : " + address + " to using mode" +usingThisApp);
}
public static void medical(int number,long phoneNumber) {
System.out.println("The using id number is : " + number + " and then " + phoneNumber);
}
public static double medical(boolean isAvaliable,int timings) {
System.out.println("The available method is: " + isAvaliable +"   "+ " And the time availble for using: " + timings);
return 4;
}
public static void main(String[] args) {
medical("Yeshwanthpur bangalore", 7);
medical(212,9875690432l);
medical(true,2);
}
}