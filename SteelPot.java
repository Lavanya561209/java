class SteelPot extends Pot {
    public void heatFood() {
        System.out.println("Steel pot is heating food quickly on the stove");
    }

    public static void main(String[] args) {
        Pot p = new SteelPot();
        p.store();
        SteelPot sp = (SteelPot) p;
        sp.heatFood();

    
        Pot clay = new ClayPot();
        clay.store();
        ClayPot cp = (ClayPot) clay;
        cp.keepCool();
		
        System.out.println(sp instanceof Pot);
	}
}