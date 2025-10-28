class Database extends Record {
    public Database() {
        super();
        System.out.println("Database connection established successfully");
    }

    public static void main(String[] args) {
        Database db = new Database();
	}
}