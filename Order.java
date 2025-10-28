class Order extends Customer {
    public Order() {
        super();
        System.out.println("Customer has placed a new order");
    }

    public static void main(String[] args) {
        Order order = new Order();
	}
}