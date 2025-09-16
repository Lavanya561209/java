class bollywoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Housefull5", "Jaat", "Stolen", "Ground Zero", "Singham Again",
            "Kanguva", "Chhaava", "Baby Jhon", "Raid 2", "Leo"
        };
        System.out.println("bollywood Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
	System.out.println("==============");
        for (String movie : movieNames) {
            System.out.println("bollywood Movies: " + movie);
        }
    }
}