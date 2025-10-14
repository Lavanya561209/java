class Newspaper {
    String paperName;
    int pages;
    String publisherEmail;
    boolean isMonthly;
    String language;

    public Newspaper() {
        this("DailyTimes");
        System.out.println(" newspaper");
    }

    public Newspaper(String paperName) {
        this("MorningStar", 12);
        System.out.println("Newspaper name set to: " + this.paperName);
    }

    public Newspaper(String paperName, int pages) {
        this("EveningPost", 20, "editor@eveningpost.com");
        System.out.println("Number of pages set to: " + this.pages);
    }

    public Newspaper(String paperName, int pages, String publisherEmail) {
        this("CityNews", 24, "info@citynews.com", false);
        System.out.println("Publisher email set to: " + this.publisherEmail);
    }

    public Newspaper(String paperName, int pages, String publisherEmail, boolean isMonthly) {
        this.paperName = paperName;
        this.pages = pages;
        this.publisherEmail = publisherEmail;
        this.isMonthly = isMonthly;
        this.language = language;

        System.out.println("Final Newspaper object created!");
        System.out.println(" Newspaper Name: " + paperName);
        System.out.println(" Pages: " + pages);
        System.out.println(" Publisher Email: " + publisherEmail);
        System.out.println(" Monthly Edition: " + isMonthly);
        System.out.println(" Language: " + language);
    }
}