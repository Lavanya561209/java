class SmartPhone extends MobilePhone {
    public void browseInternet() {
        System.out.println("Browsing the internet using the smartphone");
    }

    public static void main(String[] args) {
        System.out.println("====== Super Class =====");
        Gadget g = new Gadget();
        g.turnOn();

        System.out.println("===== Upcasting Example =====");
        Gadget device = new MobilePhone();
        device.turnOn();

        System.out.println("--------------------");
        MobilePhone mob = new MobilePhone();
        mob.makeCall();
        mob.turnOn();

        System.out.println("===========");
        SmartPhone sp = new SmartPhone();
        sp.makeCall();
        sp.turnOn();
        sp.browseInternet();

        System.out.println("&&&&&&&&&&&&&&&&");
        MobilePhone mobRef = sp;
        mobRef.makeCall();
        mobRef.turnOn();
	}
}