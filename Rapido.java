class Rapido {
public static void shift(String address, long contactNumber) {
System.out.println("The Driver is available: " +address + " has the reference number " + contactNumber);
}
public static void shift(float ratings,int helpLineNumber) {
System.out.println("The ratings of the deliver is : " + ratings + " and then " + helpLineNumber);
}
public static double shift(boolean isAvaliable,int timings) {
System.out.println("The rapido isThere: " + isAvaliable + " And the time is consumed to drop the person: " + timings);
return 3;
}
public static void main(String[] args) {
shift("Whitefiled 2nd main raod",7487584493l);
shift(4.3f,112);
shift(true,4);
}
}