class ElectricCar extends Cars {
    public void charge() {
        System.out.println("Electric car is charging efficiently");
    }

    public static void main(String[] args) {
        System.out.println("=========Super class=========");
        Vehicles v = new Vehicles();
        v.start();

        System.out.println("=======Up casting==========");
        Vehicles veh = new Cars();
        veh.start();

        System.out.println("################");
        Cars c = new Cars();
        c.drive();
        c.start();

        System.out.println("===========");
        ElectricCar ec = new ElectricCar();
        ec.drive();
        ec.start();
        ec.charge();

        System.out.println("**************");
        Cars c2 = ec;
        c2.drive();
        c2.start();
	}
}