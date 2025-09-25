class MusicApp {
public static void listening(String movieSongName, int quantity) {
System.out.println("The available song is : " + movieSongName+ " has the quantity " + quantity);
}
public static void listening(int price,long referenceNumber) {
System.out.println("Having new song cost is : " + price + " and then " +referenceNumber);
}
public static double listening(boolean isAvaliable,int time) {
System.out.println("The available music are: " + isAvaliable +"   "+ " And the time to listen the song is: " + time);
return 3;
}
public static void main(String[] args) {
listening("Bahubali", 3);
listening(400,9405690432l);
listening(true,5);
}
}