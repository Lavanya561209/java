class Courier extends Delivery {
    public Courier() {
        super();
        System.out.println("Courier is now out for delivery");
    }

    public static void main(String[] args) {
        Courier courier = new Courier();
	}
}