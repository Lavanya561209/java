class Customer {
    public Customer() {
        this(28);
        System.out.println("Customer account has been successfully created.");
    }

    public Customer(int age) {
        this("Laksha", 9876543210L);
        System.out.println("Customer age verified: " + age);
    }

    public Customer(String name, long contactNumber) {
        System.out.println("Customer name: " + name + "Contact number: " + contactNumber);
    }
}

