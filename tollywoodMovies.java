class tollywoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Pogaru", "Rajaratha", "James", "Nagarahavu", "Kavacham",
            "Shiva", "Golisoda", "Killing Veerappan", "Rogue", "Varadhanayaka"
        };
        System.out.println("tollywood Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
	System.out.println("==============");
        for (String movie : movieNames) {
            System.out.println("tollywood Movies: " + movie);
        }
    }
}