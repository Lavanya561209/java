class ElectricGuitar extends Guitar {
    public void volume() {
        System.out.println("Electric guitar volume is turned up high!!!");
    }

    public static void main(String[] args) {
        System.out.println("=========Super Class=========");
        Instruments ins = new Instruments();
        ins.sound();

        System.out.println("=========Upcasting Example=========");
        Instruments i = new Guitar();
        i.sound();

        System.out.println("--------------------");
        Guitar g = new Guitar();
        g.play();
        g.sound();

        System.out.println("==========Child Class==========");
        ElectricGuitar eg = new ElectricGuitar();
        eg.play();
        eg.sound();
        eg.volume();

        System.out.println("---------------------");
        Guitar gt = eg;
        gt.play();
        gt.sound();
	}
}