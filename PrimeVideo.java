class PrimeVideo
{
public static int watchingMovies(String movie, int rating) {
System.out.println("The Movie name is : " + movie + " And Its ratings are " + rating);
return 0;
}
public static void watchingMovies(int quality,String subtitles) {
String movie="Kantara";
if(movie=="Kantara"&&subtitles=="telugu") {
System.out.println("The movies has a subtitle : " + subtitles);
}else {
System.out.println("Its has minimum subtitles ");
}
}
public static void watchingMovies(boolean isPause,int addToList) {
System.out.println("is it paused " + isPause + " the favorite movie is added to " + addToList);
}
public static void main(String[] args) {
watchingMovies("Kantara",5);
watchingMovies(800, "Kannada");
watchingMovies(true,2);
}
}