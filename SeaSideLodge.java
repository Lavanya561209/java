class SeaSideLodge extends Lodge {
    public void beachRelax() {
        System.out.println("Relaxing near the beach and listening to the waves!");
    }

    public static void main(String[] args) {
        Lodge l = new SeaSideLodge();
        l.stay();
        SeaSideLodge ssl = (SeaSideLodge) l;
        ssl.beachRelax();

      
        Lodge lodgeHill = new HillViewLodge();
        lodgeHill.stay();
        HillViewLodge hvl = (HillViewLodge) lodgeHill;
        hvl.mountainView();

        System.out.println(ssl instanceof Lodge);
	}
}