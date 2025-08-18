class indianCricketTeam {
    public static void main(String[] args) {
        String[] capitanNames = {
            "Kapil Dev", "MS Dhoni", "Rahul Dravid", "Rohit Sharma", "Sachin Tendulkar",
            "Shubman Gill", "Suryakumar Yadav", "C.K.Nayadu", "Hema Adhikari", "Polly Umrigar"
        };
        System.out.println("indianCricketTeam:");
        for (int i = 0; i < capitanNames.length; i++) {
            System.out.println("Capitan Name: " + capitanNames[i]);
        }
	System.out.println("==============");
        for (String capitan : capitanNames) {
            System.out.println("indianCricketTeam: " + capitan);
        }
    }
}