class OlaCab {
public static void shift(String address, long contactNumber) {
System.out.println("The Driver is available: " +address + " has the reference number " + contactNumber);
}
public static void shift(float ratings,int helpLineNumber) {
System.out.println("The ratings of the deliver is : " + ratings + " and then " + helpLineNumber);
}
public static double shift(boolean isAvaliable,int timings) {
System.out.println("The cab isThere: " + isAvaliable + " And the time is consumed to drop the person: " + timings);
return 4;
}
public static void main(String[] args) {
shift("Kengeri 2nd main raod",8257584493l);
shift(4.1f,112);
shift(true,6);
}
}