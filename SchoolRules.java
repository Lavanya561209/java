class SchoolRules extends Rules {
    public void dressCode() {
        System.out.println("Students must wear proper uniform.");
    }

    public void punctuality() {
        System.out.println("Students should arrive before 8:30 AM.");
    }

    public static void main(String[] args) {
        Rules r = new SchoolRules();
        r.follow();
        r.breakRule();

        SchoolRules sr = (SchoolRules) r;
        sr.dressCode();
        sr.punctuality();

        System.out.println(sr instanceof SchoolRules);
	}
}